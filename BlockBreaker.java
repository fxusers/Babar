package com.Forge.Mod1;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class BlockBreaker {
	@SubscribeEvent
	public void sendMessage(BreakEvent event) {
		event.getPlayer().addChatComponentMessage(
				new ChatComponentText("Yor broke a block: " + 
						EnumChatFormatting.GOLD + event.block.getLocalizedName()));
		
		if (event.block != Blocks.diamond_ore)
			return;
		
		event.world.createExplosion(null, event.x, event.y, event.z, 10, true);
	}
}
