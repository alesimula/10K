package mod10k;

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

	public String getDimensionName()
	{
		return "10K";
	}

	public String getWelcomeMessage()
	{
		return "Entering 10K...";
	}

	public String getDepartMessage()
	{
		return "Leaving 10K...";
	}

	public boolean canRespawnHere()
	{
		return false;
	}

	public boolean isSurfaceWorld()
	{
		return false;
	}

	public IChunkProvider getChunkProvider()
	{
		return new ChunkProvider10K(this.worldObj, this.worldObj.getSeed(), hasNoSky);
	}

	public boolean doesXZShowFog(int par1, int par2)
	{
		return true;
	}

	public boolean isSkyColored()
	{
		return true;
	}

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManager10K();
	}
}