package mod10k.generation;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.World;
import net.minecraft.src.WorldGenerator;

import java.util.Random;

public class BiomeDecorator10K extends BiomeDecorator {
	public BiomeDecorator10K(BiomeGenBase par1BiomeGenBase) {
		super(par1BiomeGenBase);
		treesPerChunk10K = 4;
	}

	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4) {
		if (this.currentWorld != null) {
			if (this.currentWorld != null);
		} else {
			this.currentWorld = par1World;
			this.randomGenerator = par2Random;
			this.chunk_X = par3;
			this.chunk_Z = par4;
			this.decorate();
			this.currentWorld = null;
			this.randomGenerator = null;
		}
	}

	public int treesPerChunk10K;

	@Override
	protected void decorate() {
		int var1;
		int var2;
		int var3;
		int var7;

		var1 = this.treesPerChunk10K;

		if (this.randomGenerator.nextInt(10) == 0) {
			++var1;
		}

		int var4;

		for (var2 = 0; var2 < var1; ++var2) {
			var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
			var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
			WorldGenerator var5 = this.biome.getRandomWorldGenForTrees(this.randomGenerator);
			var5.setScale(1.0D, 1.0D, 1.0D);
			var5.generate(this.currentWorld, this.randomGenerator, var3, this.currentWorld.getHeightValue(var3, var4), var4);
		}
	}

	public void treesPerChunk10K(int i) {
	}
}