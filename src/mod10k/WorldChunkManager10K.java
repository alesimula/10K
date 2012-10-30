package mod10k;

import net.minecraft.src.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.src.BiomeCache;

public class WorldChunkManager10K extends WorldChunkManager
{
	private GenLayer genBiomes;
	private GenLayer biomeIndexLayer;
	private BiomeCache biomeCache;
	private List biomesToSpawnIn;

	protected WorldChunkManager10K()
	{
		this.biomeCache = new BiomeCache(this);
		this.biomesToSpawnIn = new ArrayList();
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

	public List getBiomesToSpawnIn()
	{
		return (List) BiomeGenBase10K.forest10K;
	}

	public BiomeGenBase getBiomeGenAt(int par1, int par2)
	{
		return (BiomeGenBase) this.biomeCache.getBiomeGenAt(par1, par2);
	}

	public void cleanupCache()
	{
		this.biomeCache.cleanupCache();
	}
}