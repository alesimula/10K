package com.misterfiber.mod10k.generation;

import com.misterfiber.mod10k.Mod10K;

import net.minecraft.src.IChunkProvider;
import net.minecraft.src.WorldChunkManagerHell;
import net.minecraft.src.WorldProvider;

public class WorldProvider10K extends WorldProvider {
	public WorldProvider10K() {
		this.setDimension(Mod10K.dimension10KID);
		this.dimensionId = Mod10K.dimension10KID;
	}

	@Override
	public String getDimensionName() {
		return "10K";
	}

	@Override
	public String getWelcomeMessage() {
		return "Entering 10K...";
	}

	@Override
	public String getDepartMessage() {
		return "Leaving 10K...";
	}

	@Override
	public boolean canRespawnHere() {
		return false;
	}

	@Override
	public boolean isSurfaceWorld() {
		return true;
	}

	@Override
	public String getSaveFolder() {
		return "DIM-10K";
	}

	@Override
	public boolean doesXZShowFog(int par1, int par2) {
		return true;
	}

	@Override
	public boolean isSkyColored() {
		return true;
	}

	@Override
	protected void registerWorldChunkManager() {
		worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase10K.forest10K, 0.4F, 0.2F);
	}

	public IChunkProvider getChunkProvider() {
		return new ChunkProvider10K(worldObj, worldObj.getSeed(), true);
	}
}