package mod10k;

import net.minecraft.src.*;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class CustomBiomeGenBase extends BiomeGenBase
{
	public static final CustomBiomeGenBase postApoForest = (CustomBiomeGenBase) (new BiomePostApoForest(80));
	
	protected CustomBiomeGenBase(int par1)
	{
		super(par1);
		postApoDecorator = createPostApoDecorator();
		
		worldGenFir = new WorldGenFir();
		worldGenFir2 = new WorldGenFir2(false);
	}
	
	public PostApoDecorator postApoDecorator;
	
	protected PostApoDecorator createPostApoDecorator()
    {
        return new PostApoDecorator(this);
    }
	
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        this.postApoDecorator.decorate(par1World, par2Random, par3, par4);
    }
	
	protected WorldGenFir worldGenFir;
	protected WorldGenFir2 worldGenFir2;
}