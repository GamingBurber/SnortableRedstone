
package net.mcreator.redstonesnorting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.redstonesnorting.itemgroup.SnortableRedstoneItemGroup;
import net.mcreator.redstonesnorting.RedstonesnortingModElements;

@RedstonesnortingModElements.ModElement.Tag
public class SnortedRedPowderItem extends RedstonesnortingModElements.ModElement {
	@ObjectHolder("redstonesnorting:snorted_red_powder")
	public static final Item block = null;
	public SnortedRedPowderItem(RedstonesnortingModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(SnortableRedstoneItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("snorted_red_powder");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
