package mod10k.generation;

import mod10k.*;
import net.minecraft.src.*;

public class BiomeGenBase10K extends BiomeGenBase
{
	public static final BiomeGenBase[] biomeList10K = new BiomeGenBase10K[256];
	public static final BiomeGenBase forest10K = (new BiomeGenForest10K(Mod10K.forest10KID));

	public BiomeGenBase10K(int par1)
	{
		super(par1);
		biomeList10K[par1] = this;
	}
}