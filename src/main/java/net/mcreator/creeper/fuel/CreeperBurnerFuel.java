
package net.mcreator.creeper.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.creeper.item.CreeperIngotItem;
import net.mcreator.creeper.CreeperModElements;

@CreeperModElements.ModElement.Tag
public class CreeperBurnerFuel extends CreeperModElements.ModElement {
	public CreeperBurnerFuel(CreeperModElements instance) {
		super(instance, 4);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CreeperIngotItem.block, (int) (1)).getItem())
			event.setBurnTime(3600);
	}
}
