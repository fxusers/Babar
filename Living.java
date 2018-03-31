package com.Forge.Mod1;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class Living {
	private int power = 2;
	@SubscribeEvent
	public void explode(LivingHurtEvent event)
	{
		if (event.source != DamageSource.anvil )
		   return;
		
		Entity anvil = event.entity;
		
		anvil.worldObj.createExplosion(anvil, anvil.posX, anvil.posY, anvil.posZ, power, true);
	}
}
