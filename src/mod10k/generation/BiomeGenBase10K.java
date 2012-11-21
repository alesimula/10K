package mod10k.generation;

import java.util.Random;

import mod10k.Mod10K;

import net.minecraft.src.BiomeDecorator;
import net.minecraft.src.BiomeGenBase;
import net.minecraft.src.World;

public class BiomeGenBase10K extends BiomeGenBase {
	public static final BiomeGenBase[] biomeList10K = new BiomeGenBase10K[256];
	public static final BiomeGenBase forest10K = (new BiomeGenForest10K(Mod10K.forest10KID));

	public BiomeDecorator10K theBiomeDecorator10K;
	
	public WorldGenTrees10K worldGenTrees10K;

	public BiomeGenBase10K(int par1) {
		super(par1);
		biomeList10K[par1] = this;
		theBiomeDecorator10K = createBiomeDecorator10K();
		worldGenTrees10K = new WorldGenTrees10K(false);
	}

	public BiomeDecorator10K createBiomeDecorator10K() {
		return new BiomeDecorator10K(this);
	}

	@Override
	public void decorate(World par1World, Random par2Random, int par3, int par4) {
		this.theBiomeDecorator10K.decorate(par1World, par2Random, par3, par4);
	}
}