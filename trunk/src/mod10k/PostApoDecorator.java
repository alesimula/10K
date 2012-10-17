package mod10k;

import java.util.Random;

import net.minecraft.src.*;

public class PostApoDecorator extends BiomeDecorator
{
	protected int vanillaGrassPerChunk;
	
	public PostApoDecorator(BiomeGenBase par1BiomeGenBase)
	{
		super(par1BiomeGenBase);
		postApoTreesPerChunk = 2;
	}
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        if (this.currentWorld != null)
        {
        	if (this.currentWorld != null);
        }
        else
        {
            this.currentWorld = par1World;
            this.randomGenerator = par2Random;
            this.chunk_X = par3;
            this.chunk_Z = par4;
            this.decorate();
            this.currentWorld = null;
            this.randomGenerator = null;
        }
    }

	protected int postApoTreesPerChunk;
	
	protected void decorate()
	{
		int var1;
		int var2;
		int var3;
		int var7;
		
		var1 = this.postApoTreesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++var1;
        }
        
        int var4;

        for (var2 = 0; var2 < var1; ++var2)
        {
            var3 = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            var4 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            WorldGenerator var5 = this.biome.getRandomWorldGenForTrees(this.randomGenerator);
            var5.setScale(1.0D, 1.0D, 1.0D);
            var5.generate(this.currentWorld, this.randomGenerator, var3, this.currentWorld.getHeightValue(var3, var4), var4);
        }
	}

	public void postApoTreesPerChunk(int i)
	{
	}
}