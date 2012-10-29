package mod10k;

import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "mod10k", name = "10K", version = "V0.0A")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class Mod10K
{
	public static int testID;
	public static int dimension10KID;
	public static int forest10KID;
	
	@PreInit
    public void preInit(FMLPreInitializationEvent event)
	{
		Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
		configuration.load();
		int dimension10KID = configuration.get("10K Generation (CAUTION)", "10K Dimension ID", 8).getInt(8);
		int forest10KID = configuration.get("10K Generation (CAUTION)", "10K Forest Biome ID", 60).getInt(60);
		configuration.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		final BiomeGenBase forest10K = (new BiomeGenForest10K(forest10KID)).setBiomeName("10K").setColor(0x717d64);
		//DimensionManager.registerProviderType(dimension10KID, ChunkProvider10K.class, true);
		//DimensionManager.registerDimension(dimension10KID, dimension10KID);
	}
	
	public String getLabel()
	{
		return "10K";
	}
}