package mod10k.generation;

import mod10k.*;
import net.minecraft.src.*;

public class BiomeGenBase10K extends BiomeGenBase
{
	public static final BiomeGenBase10K[] biomeList = new BiomeGenBase10K[256];
	public static final BiomeGenBase10K forest10K = (BiomeGenBase10K) (new BiomeGenForest10K(Mod10K.forest10KID));

	public BiomeGenBase10K(int par1)
	{
		super(par1);
		biomeList[par1] = this;
	}
}