package mod10k;

import java.util.Random;
import net.minecraft.src.*;

public class BiomePostApoForest extends CustomBiomeGenBase
{
	protected BiomePostApoForest(int par1)
	{
		super(par1);
		minHeight = -0.2F;
		maxHeight = 0.2F;
		temperature = 0.5F;
		rainfall = 0.6F;
		waterColorMultiplier = 0xCC7A00;
		color = 0xA37547;
		biomeName = "Woods";
		spawnableWaterCreatureList.clear();
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		topBlock = (byte) mod_10k.postApoGrass.blockID;
	}
	
	public int getSkyColorByTemp(float par1)
    {
		return 0x4d7e93;
    }
	
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
		if (par1Random.nextInt(2) == 0)
		{
			return worldGenFir;
		}
		else
		{
			return worldGenFir2;
		}
	}
}