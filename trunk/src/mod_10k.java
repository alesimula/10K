package net.minecraft.src;

import java.util.*;
import net.minecraft.client.Minecraft;
import java.io.*;
import net.minecraftforge.*;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.Configuration;
import mod10k.*;

public class mod_10k extends BaseMod
{
	static Configuration configuration = new Configuration(new File(Minecraft.getMinecraftDir(), "/config/10K.cfg"));
	
	static int postApoGrassID = configurationProperties();
	
	static int woodenBucketEmptyID;
	static int woodenBucketWaterID;
	
	public static PostApoWorldType postApo = new PostApoWorldType();
	
	public static Block postApoGrass = (BlockPostApoGrass) new BlockPostApoGrass(postApoGrassID, 2).setHardness(0.6F).setResistance(0F).setBlockName("postApoGrass").setStepSound(Block.soundGrassFootstep);
	
	public static Item woodenBucketEmpty = (new ItemWoodenBucket(woodenBucketEmptyID, 0)).setIconIndex(0).setItemName("woodenBucket").setMaxStackSize(16);
	public static Item woodenBucketWater = (new ItemWoodenBucket(woodenBucketWaterID, Block.waterMoving.blockID)).setIconIndex(1).setItemName("woodenBucketWater").setContainerItem(woodenBucketEmpty);
	
	
	public mod_10k()
    {
    }

	public void load()
    {
		ModLoader.addLocalization("generator.postApo", "10K");
		
		MinecraftForgeClient.preloadTexture("/mod10k/10k.png");
		
		ModLoader.registerBlock(postApoGrass);
		
		ModLoader.addName(postApoGrass, "Grass");
		
		ModLoader.addName(woodenBucketEmpty, "Wooden Bucket");
		ModLoader.addName(woodenBucketWater, "Wooden Water Bucket");
		
		ModLoader.addRecipe(new ItemStack(woodenBucketEmpty, 1), new Object[] { "a a", "a a", " a ", Character.valueOf('a'), Block.planks});
    }
	
	public String getVersion()
    {
        return "10K V0.0A";
    }
	
	public static int configurationProperties()
    {
        configuration.load();
        postApoGrassID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Grass (10K)", 240).value);
        
        woodenBucketEmptyID = Integer.parseInt(configuration.getOrCreateIntProperty("Wooden Bucket (Empty)", Configuration.CATEGORY_ITEM, 1200).value);
        woodenBucketWaterID = Integer.parseInt(configuration.getOrCreateIntProperty("Wooden Bucket (Water)", Configuration.CATEGORY_ITEM, 1201).value);

        configuration.save();
        return postApoGrassID;
    }
}