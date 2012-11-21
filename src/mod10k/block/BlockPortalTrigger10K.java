package mod10k.block;

import mod10k.Mod10K;

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
		if (par1World.provider.dimensionId > 0 || par1World.getBlockId(par2, par3 - 1, par4) != Block.obsidian.blockID || !((BlockPortal10K) Mod10K.portal10K).tryToCreatePortal(par1World, par2, par3, par4)) {
		} else {
			return;
		}
	}

	@Override
	public String getTextureFile() {
		return "/mod10k/assets/10k.png";
	}
}