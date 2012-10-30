package mod10k;

import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "mod10k", name = "10K", version = "V0.0A")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)
public class Mod10K
{
	public static int dimension10KID;
	public static int forest10KID;

	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
		configuration.load();
		Mod10K.dimension10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Dimension ID", 4).getInt();
		Mod10K.forest10KID = configuration.get("Generation", "(ALTER AT OWN RISK) 10K Biome ID", 60).getInt();
		configuration.save();
	}

	@Init
	public void load(FMLInitializationEvent event)
	{
		DimensionManager.registerProviderType(dimension10KID, WorldProvider10K.class, true);
		DimensionManager.registerDimension(dimension10KID, dimension10KID);
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