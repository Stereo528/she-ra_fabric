package io.github.stereo528.tools;

import io.github.stereo528.util.ItemRegister;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EtheriumTool implements ToolMaterial {

    public static final EtheriumTool ETHERIUM_TOOL = new EtheriumTool();

    @Override
    public int getDurability() {
        return 800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0f;
    }

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegister.INGOT_E);
    }
}
