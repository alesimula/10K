package mod10k;

import java.util.*;
import net.minecraft.src.*;

public class PostApoChunkManager extends WorldChunkManager
{
	private List biomesToSpawnIn;

	public PostApoChunkManager()
	{
		biomesToSpawnIn = new ArrayList();
		biomesToSpawnIn.add(CustomBiomeGenBase.postApoForest);
	}

	public PostApoChunkManager(World world)
	{
		this();
	}

	public List getBiomesToSpawnIn()
	{
		return biomesToSpawnIn;
	}

	private BiomeGenBase activeBiome(int i, int j)
	{
		return CustomBiomeGenBase.postApoForest;
	}

	public BiomeGenBase getBiomeGenAt(int i, int j)
	{
		return activeBiome(i, j);
	}

	public float[] getRainfall(float par1ArrayOfFloat[], int par2, int par3, int par4, int par5)
	{
		if (par1ArrayOfFloat == null || par1ArrayOfFloat.length < par4 * par5)
		{
			par1ArrayOfFloat = new float[par4 * par5];
		}
		Arrays.fill(par1ArrayOfFloat, 0, par4 * par5, 0.0F);
		return par1ArrayOfFloat;
	}

	public float[] getTemperatures(float par1ArrayOfFloat[], int par2, int par3, int par4, int par5)
	{
		if (par1ArrayOfFloat == null || par1ArrayOfFloat.length < par4 * par5)
		{
			par1ArrayOfFloat = new float[par4 * par5];
		}
		Arrays.fill(par1ArrayOfFloat, 0, par4 * par5, 0.0F);
		return par1ArrayOfFloat;
	}

	public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase par1ArrayOfBiomeGenBase[], int par2, int par3, int par4, int par5)
	{
		if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
		{
			par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
		}
		Arrays.fill(par1ArrayOfBiomeGenBase, 0, par4 * par5, CustomBiomeGenBase.postApoForest);
		return par1ArrayOfBiomeGenBase;
	}

	public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase par1ArrayOfBiomeGenBase[], int par2, int par3, int par4, int par5)
	{
		if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
		{
			par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
		}
		Arrays.fill(par1ArrayOfBiomeGenBase, 0, par4 * par5, CustomBiomeGenBase.postApoForest);
		return par1ArrayOfBiomeGenBase;
	}

	public boolean areBiomesViable(int i, int j, int k, List list)
	{
		return true;
	}

	public BiomeGenBase[] getBiomeGenAt(BiomeGenBase par1ArrayOfBiomeGenBase[], int par2, int par3, int par4, int par5, boolean par6)
	{
		return loadBlockGeneratorData(par1ArrayOfBiomeGenBase, par2, par3, par4, par5);
	}

	public ChunkPosition findBiomePosition(int i, int j, int k, List list, Random random)
	{
		return new ChunkPosition(0, 0, 0);
	}
}