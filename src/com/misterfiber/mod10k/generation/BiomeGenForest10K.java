package com.misterfiber.mod10k.generation;

import java.util.Random;

import net.minecraft.src.WorldGenTaiga1;
import net.minecraft.src.WorldGenTaiga2;
import net.minecraft.src.WorldGenerator;

public class BiomeGenForest10K extends BiomeGenBase10K {
	public BiomeGenForest10K(int par1) {
		super(par1);
		minHeight = -0.1F;
		maxHeight = 0.1F;
		waterColorMultiplier = 0xCC7A00;
		spawnableCreatureList.clear();
		spawnableMonsterList.clear();
		spawnableWaterCreatureList.clear();
		field_82914_M.clear();
		rainfall = 0.4F;
		temperature = 0.2F;
		setBiomeName("10K");
		setColor(0x5E7679);
	}

	@Override
	public int getSkyColorByTemp(float f) {
		return 0x374458;
	}

	@Override
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random) {
		return worldGenTrees10K;
	}
}