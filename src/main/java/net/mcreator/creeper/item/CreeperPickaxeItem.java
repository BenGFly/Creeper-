
package net.mcreator.creeper.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.creeper.CreeperModElements;

@CreeperModElements.ModElement.Tag
public class CreeperPickaxeItem extends CreeperModElements.ModElement {
	@ObjectHolder("creeper:creeper_pickaxe")
	public static final Item block = null;
	public CreeperPickaxeItem(CreeperModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1800;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CreeperIngotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("creeper_pickaxe"));
	}
}
