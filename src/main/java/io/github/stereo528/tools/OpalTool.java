package io.github.stereo528.tools;

import io.github.stereo528.util.ItemRegister;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class OpalTool implements ToolMaterial {

    public static final OpalTool INSTANCE = new OpalTool();


    @Override
    public int getDurability() {
        return 400;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ItemRegister.OPAL);
    }
}
