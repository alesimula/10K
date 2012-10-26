package mod10k;

import net.minecraft.src.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "mod10k", name = "10K", version = "V0.0A")
@NetworkMod(clientSideRequired = false, serverSideRequired = false)

public class mod10k
{
	@Init
	public void load(FMLInitializationEvent event)
	{
	}
}