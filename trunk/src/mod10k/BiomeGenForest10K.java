package mod10k;

import net.minecraft.src.*;

public class BiomeGenForest10K extends BiomeGenBase
{
	public BiomeGenForest10K(int par1)
	{
		super(par1);
		this.minHeight = 0.0F;
		this.maxHeight = 0.2F;
		this.waterColorMultiplier = 0xc6b69f;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.rainfall = 0.4F;
		this.temperature = 0.2F;
	}
}