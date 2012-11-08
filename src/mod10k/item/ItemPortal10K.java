package mod10k.item;

import mod10k.*;
import net.minecraft.src.*;
import net.minecraft.server.MinecraftServer;

public class ItemPortal10K extends Item
{
	public ItemPortal10K(int par1)
	{
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
	{
		if (par2EntityPlayer.ridingEntity == null && par2EntityPlayer.riddenByEntity == null && par2EntityPlayer instanceof EntityPlayerMP)
		{
			if (ModLoader.getMinecraftInstance().thePlayer.timeUntilPortal == 0)
			{
				if (ModLoader.getMinecraftInstance().thePlayer.dimension != Mod10K.dimension10KID)
				{
					ModLoader.getMinecraftInstance().thePlayer.timeUntilPortal = 10;
					MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP) par2EntityPlayer, Mod10K.dimension10KID);
				}
				else
				{
					ModLoader.getMinecraftInstance().thePlayer.timeUntilPortal = 10;
					MinecraftServer.getServer().getConfigurationManager().transferPlayerToDimension((EntityPlayerMP) par2EntityPlayer, 0);
				}
			}
			else
			{
				ModLoader.getMinecraftInstance().thePlayer.timeUntilPortal = 10;
			}

		}
		return true;
	}

	@Override
	public String getTextureFile()
	{
		return "/mod10k/assets/10k.png";
	}
}