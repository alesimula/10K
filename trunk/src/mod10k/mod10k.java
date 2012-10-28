package mod10k;

import net.minecraft.src.*;
import net.minecraftforge.common.Configuration;
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
	@PreInit
    public void preInit(FMLPreInitializationEvent event)
	{
		Configuration configuration = new Configuration(event.getSuggestedConfigurationFile());
		configuration.load();
		int testID = configuration.getBlock("Test", 230).getInt();
		configuration.save();
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
	}
}