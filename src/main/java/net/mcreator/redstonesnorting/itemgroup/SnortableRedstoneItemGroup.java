
package net.mcreator.redstonesnorting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.redstonesnorting.item.TheRedPowderStuffItem;
import net.mcreator.redstonesnorting.RedstonesnortingModElements;

@RedstonesnortingModElements.ModElement.Tag
public class SnortableRedstoneItemGroup extends RedstonesnortingModElements.ModElement {
	public SnortableRedstoneItemGroup(RedstonesnortingModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabsnortable_redstone") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(TheRedPowderStuffItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
