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
	
	public static PostApoWorldType postApo = new PostApoWorldType();
	
	public static Block postApoGrass = (BlockPostApoGrass) new BlockPostApoGrass(postApoGrassID, 2).setHardness(0.6F).setResistance(0F).setBlockName("postApoGrass").setStepSound(Block.soundGrassFootstep);
	
	public mod_10k()
    {
    }

	public void load()
    {
		ModLoader.addLocalization("generator.postApo", "10K");
		
		MinecraftForgeClient.preloadTexture("/mod10k/10k.png");
		
		ModLoader.registerBlock(postApoGrass);
		
		ModLoader.addName(postApoGrass, "Grass");
    }
	
	public String getVersion()
    {
        return "10K V0.0A";
    }
	
	public static int configurationProperties()
    {
        configuration.load();
        postApoGrassID = Integer.parseInt(configuration.getOrCreateBlockIdProperty("Grass (10K)", 460).value);

        configuration.save();
        return postApoGrassID;
    }
}