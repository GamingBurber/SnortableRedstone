
package net.mcreator.redstonesnorting;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.redstonesnorting.item.TheRedPowderStuffItem;

@RedstonesnortingModElements.ModElement.Tag
public class BrewingForGoodStuffBrewingRecipe extends RedstonesnortingModElements.ModElement {
	public BrewingForGoodStuffBrewingRecipe(RedstonesnortingModElements instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.SUGAR;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.REDSTONE;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(TheRedPowderStuffItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
