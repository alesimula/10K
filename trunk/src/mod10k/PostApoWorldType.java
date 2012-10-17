package mod10k;

import net.minecraft.src.*;

public class PostApoWorldType extends WorldType
{
	public PostApoWorldType()
	{
		super(10, "postApo");
	}

	public WorldChunkManager getChunkManager(World world)
	{
		return new PostApoChunkManager(world);
	}

	public IChunkProvider getChunkGenerator(World world)
	{
		return new PostApoChunkProvider(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled());
	}

	public boolean hasVoidParticles(boolean flag)
	{
		return false;
	}

	public int getSeaLevel(World world)
	{
		return 64;
	}
}