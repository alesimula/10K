package mod10k;

import net.minecraft.src.*;

public class BiomeGenBase10K extends BiomeGenBase
{
	public BiomeGenBase10K(int par1)
	{
		super(par1);
		biomeList[par1] = this;
	}

	public static final BiomeGenBase10K forest10K = (BiomeGenBase10K) (new BiomeGenForest10K(mod10k.Mod10K.dimension10KID)).setBiomeName("10K").setColor(0x717d64);

	public BiomeDecorator10K createBiomeDecorator10K()
	{
		return new BiomeDecorator10K(this);
	}

	public BiomeGenBase10K func_76733_a(int par1)
	{
		this.field_76754_C = par1;
		return this;
	}
}