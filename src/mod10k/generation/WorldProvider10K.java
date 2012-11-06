package mod10k.generation;

import net.minecraft.src.*;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class WorldProvider10K extends WorldProvider
{
	public WorldProvider10K()
	{
		this.dimensionId = mod10k.Mod10K.dimension10KID;
		this.setDimension(mod10k.Mod10K.dimension10KID);
	}

	@Override
	public String getDimensionName()
	{
		return "10K";
	}

	@Override
	public String getWelcomeMessage()
	{
		return "Entering 10K...";
	}

	@Override
	public String getDepartMessage()
	{
		return "Leaving 10K...";
	}

	@Override
	public boolean canRespawnHere()
	{
		return false;
	}

	@Override
	public boolean isSurfaceWorld()
	{
		return false;
	}

	@Override
	public IChunkProvider getChunkProvider()
	{
		return new ChunkProvider10K(this.worldObj, this.worldObj.getSeed(), hasNoSky);
	}

	@Override
	public boolean doesXZShowFog(int par1, int par2)
	{
		return true;
	}

	@Override
	public boolean isSkyColored()
	{
		return true;
	}

	@Override
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManager10K();
	}
}