package com.misterfiber.mod10k.block;

import com.misterfiber.mod10k.Mod10K;
import com.misterfiber.mod10k.proxy.ClientProxy10K;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class BlockPortalTrigger10K extends Block {
	public BlockPortalTrigger10K(int par1, int par2) {
		super(par1, par2, Material.rock);
		this.setTickRandomly(true);
		this.setCreativeTab(Mod10K.creativeTab10K);
		this.setHardness(1.2F);
		this.setStepSound(Block.soundGlassFootstep);
		this.setBlockName("portalTrigger10K");
	}

	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4) {
		if (par1World.getBlockId(par2, par3 - 1, par4) != Block.obsidian.blockID || !BlockPortal10K.tryToCreatePortal(par1World, par2, par3, par4)) {
			if (par3 - 1 != Block.obsidian.blockID) {
			} else {
				par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, this.tickRate() + par1World.rand.nextInt(10));
			}
		}
	}

	@Override
	public String getTextureFile() {
		return ClientProxy10K.BLOCK_PNG;
	}
}