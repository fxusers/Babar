package com.Forge.Mod1;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class BiggerTNT {
	float power = 32.0F;
	@SubscribeEvent
	public void explode(EntityJoinWorldEvent event) {
		
		if (!(event.entity instanceof EntityTNTPrimed))
			return;

		Entity entity = event.entity;
		event.entity.worldObj.createExplosion(entity,
				entity.posX, entity.posY, entity.posZ,
				power, true);
	}
}
