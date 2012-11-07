package mod10k;

import mod10k.assets.*;
import mod10k.block.*;
import mod10k.generation.*;
import mod10k.item.*;
import mod10k.mob.*;
import mod10k.proxy.*;
import mod10k.utility.*;
import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "mod10k", name = "10K", version = "IN-DEV")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class Mod10K
{
	public static int dimension10KID;
	public static int forest10KID;
	public static int portal10KID;
	public static int portalTrigger10KID;
	public static int itemPortal10KID;

	public static Block portal10K;
	public static Block portalTrigger10K;
	public static Item itemPortal10K;

	@SidedProxy(clientSide = "mod10k.proxy.ClientProxy10K", serverSide = "mod10k.proxy.CommonProxy10K")
	public static CommonProxy10K proxy10K;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
		configuration.load();
		Mod10K.dimension10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Dimension ID", 4).getInt();
		Mod10K.forest10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Biome ID", 60).getInt();
		Mod10K.portal10KID = configuration.getBlock("10K Portal Block", 230).getInt();
		Mod10K.portalTrigger10KID = configuration.getBlock("10K Portal Trigger", 231).getInt();
		Mod10K.itemPortal10KID = configuration.getItem("10K Item Portal", 4100).getInt();
		configuration.save();
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
		DimensionManager.registerProviderType(dimension10KID, WorldProvider10K.class, true);
		DimensionManager.registerDimension(dimension10KID, dimension10KID);

		//portal10K = (BlockPortal10K) (new BlockPortal10K(portal10KID, 0)).setHardness(-1.0F).setStepSound(Block.soundGlassFootstep).setBlockName("portal10K");
		//portalTrigger10K = (new BlockPortalTrigger10K(portalTrigger10KID, 1)).setHardness(1.2F).setStepSound(Block.soundGlassFootstep).setBlockName("portal10K");
		
		itemPortal10K = (new ItemPortal10K(itemPortal10KID).setIconIndex(0).setItemName("itemPortal10K"));

		//GameRegistry.registerBlock(portal10K);
		//GameRegistry.registerBlock(portalTrigger10K);

		//LanguageRegistry.addName(portal10K, "Portal");
		//LanguageRegistry.addName(portalTrigger10K, "10K Portal Trigger");
		LanguageRegistry.addName(itemPortal10K, "10K Portal");

		proxy10K.registerRenderInformation();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
	}

	public String getLabel()
	{
		return "10K";
	}
}