package com.Forge.Mod1;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraftforge.event.entity.minecart.MinecartCollisionEvent;

/* Столкновение вагонетки с чем-нибудь */
public class Cart {
	@SubscribeEvent
	public void explode(MinecartCollisionEvent event)
	{
		EntityMinecart cart = event.minecart;
		
		cart.worldObj.createExplosion(cart, cart.posX, cart.posY, cart.posZ, 2, false);
	}
}
