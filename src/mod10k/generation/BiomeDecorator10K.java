package mod10k.generation;

import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.World;

import java.util.Random;

public class BiomeDecorator10K {
	protected World currentWorld;
	protected Random randomGenerator;
	protected int chunk_X;
	protected int chunk_Z;
	protected BiomeGenBase biome;

	public BiomeDecorator10K(BiomeGenBase par1BiomeGenBase) {
	}

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

	protected void decorate() {
		int var1;
		int var2;
		int var3;
	}
}