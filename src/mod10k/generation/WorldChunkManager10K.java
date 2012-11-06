package mod10k.generation;

import net.minecraft.src.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.src.BiomeCache;

public class WorldChunkManager10K extends WorldChunkManager
{
	private static final BiomeGenBase10K forest10K = null;

	public static ArrayList<BiomeGenBase10K> allowedBiomes = new ArrayList<BiomeGenBase10K>(Arrays.asList(forest10K));

	private GenLayer genBiomes;
	private GenLayer biomeIndexLayer;
	private BiomeCache biomeCache;
	private List biomesToSpawnIn;

	protected WorldChunkManager10K()
	{
		this.biomeCache = new BiomeCache(this);
		this.biomesToSpawnIn = new ArrayList();
		this.biomesToSpawnIn.addAll(allowedBiomes);
	}

	public WorldChunkManager10K(long par1, WorldType par3WorldType)
	{
		this();
		GenLayer[] var4 = GenLayer.initializeAllBiomeGenerators(par1, par3WorldType);
		this.genBiomes = var4[0];
		this.biomeIndexLayer = var4[1];
	}

	public WorldChunkManager10K(World par1World)
	{
		this(par1World.getSeed(), par1World.getWorldInfo().getTerrainType());
	}

	@Override
	public List getBiomesToSpawnIn()
	{
		return (List) BiomeGenBase10K.forest10K;
	}

	@Override
	public BiomeGenBase getBiomeGenAt(int par1, int par2)
	{
		return (BiomeGenBase) this.biomeCache.getBiomeGenAt(par1, par2);
	}

	@Override
	public float[] getTemperatures(float[] par1ArrayOfFloat, int par2, int par3, int par4, int par5)
	{
		return null;
	}

	@Override
	public void cleanupCache()
	{
		this.biomeCache.cleanupCache();
	}
}