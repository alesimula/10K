package mod10k.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy10K extends CommonProxy10K {
	public static String BLOCK_PNG = "/mod10k/assets/10k.png";
	@Override
	public void registerRenderInformation() {
		MinecraftForgeClient.preloadTexture(ClientProxy10K.BLOCK_PNG);
	}
}