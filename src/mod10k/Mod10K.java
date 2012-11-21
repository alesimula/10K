package mod10k;

import mod10k.block.BlockPortal10K;
import mod10k.block.BlockPortalTrigger10K;
import mod10k.generation.WorldProvider10K;
import mod10k.proxy.CommonProxy10K;
import mod10k.utility.CreativeTab10K;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "Mod10K", name = Mod10K.mod10KName, version = Mod10K.mod10KVersion)
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class Mod10K {
	public static int dimension10KID;
	public static int forest10KID;
	public static int portal10KID;
	public static int portalTrigger10KID;

	public static final String mod10KName = "10K";
	public static final String mod10KVersion = "V0.0A";
	public static final String mcVersion = "1.4.5";

	public static Block portal10K;
	public static Block portalTrigger10K;

	@Instance("Mod10K")
	public static Mod10K instance;

	@SidedProxy(clientSide = "mod10k.proxy.ClientProxy10K", serverSide = "mod10k.proxy.CommonProxy10K")
	public static CommonProxy10K proxy10K;

	public static final CreativeTabs creativeTab10K = new CreativeTab10K(CreativeTabs.creativeTabArray.length, "mod10KTab");

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
		configuration.load();
		Mod10K.dimension10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Dimension ID", 4).getInt();
		Mod10K.forest10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Biome ID", 60).getInt();
		Mod10K.portal10KID = configuration.getBlock("10K Portal Block", 230).getInt();
		Mod10K.portalTrigger10KID = configuration.getBlock("10K Portal Trigger", 231).getInt();
		configuration.save();
	}

	@Init
	public void load(FMLInitializationEvent event) {
		DimensionManager.registerProviderType(dimension10KID, WorldProvider10K.class, true);
		DimensionManager.registerDimension(dimension10KID, dimension10KID);

		portal10K = (BlockPortal10K) (new BlockPortal10K(portal10KID, 0));
		portalTrigger10K = (new BlockPortalTrigger10K(portalTrigger10KID, 1));

		GameRegistry.registerBlock(portal10K);
		GameRegistry.registerBlock(portalTrigger10K);

		LanguageRegistry.addName(portal10K, "Portal");
		LanguageRegistry.addName(portalTrigger10K, "Portal Trigger");
		LanguageRegistry.instance().addStringLocalization("itemGroup.mod10KTab", "en_US", "10K");

		proxy10K.registerRenderInformation();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
	}
}