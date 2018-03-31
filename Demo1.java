package com.Forge.Mod1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Demo1.MODID, name = Demo1.NAME, version = Demo1.VERSION)

public class Demo1 {
	public static final String MODID   = "Mod3";
	public static final String NAME    = "MyFirstMod";
	public static final String VERSION = "1.0";
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new Living());
	}
}
