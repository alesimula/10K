package mod10k.utility;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import mod10k.Mod10K;
import net.minecraft.src.CreativeTabs;

public class CreativeTab10K extends CreativeTabs
{
	public CreativeTab10K(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public int getTabIconItemIndex()
	{
		return Mod10K.portalTrigger10KID;
	}
}