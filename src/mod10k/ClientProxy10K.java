package mod10k;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy10K extends CommonProxy10K
{
	@Override
	public void registerRenderInformation()
	{
		MinecraftForgeClient.preloadTexture("/mod10k/10k.png");
	}
}