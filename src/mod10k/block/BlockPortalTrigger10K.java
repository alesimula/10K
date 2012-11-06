package mod10k.block;

import mod10k.*;
import net.minecraft.src.*;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.util.Random;
import net.minecraftforge.common.ForgeDirection;
import static net.minecraftforge.common.ForgeDirection.*;

public class BlockPortalTrigger10K extends Block
{
	public BlockPortalTrigger10K(int par1, int par2)
	{
		super(par1, par2, Material.rock);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	@Override
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		if (par1World.provider.dimensionId > 0 || par1World.getBlockId(par2, par3 - 1, par4) != Block.obsidian.blockID || !((BlockPortal10K) Mod10K.portal10K).tryToCreatePortal(par1World, par2, par3, par4))
		{
		}
		else
		{
			return;
		}
	}

	@Override
	public String getTextureFile()
	{
		return "/mod10k/art/10k.png";
	}
}