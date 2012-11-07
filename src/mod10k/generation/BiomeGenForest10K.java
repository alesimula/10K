package mod10k.generation;

import net.minecraft.src.*;

public class BiomeGenForest10K extends BiomeGenBase10K
{
	public BiomeGenForest10K(int par1)
	{
		super(par1);
		minHeight = 0.0F;
		maxHeight = 0.2F;
		waterColorMultiplier = 0xc6b69f;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		rainfall = 0.4F;
		temperature = 0.2F;
		setBiomeName("10K");
		setColor(0x717d64);
	}

	@Override
	public int getSkyColorByTemp(float f)
	{
		return 0x7B94AD;
	}
}