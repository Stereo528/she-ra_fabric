package io.github.stereo528.ItemTypes;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GiveItGlint extends Item {
    public GiveItGlint(Settings settings) {
        super(settings);
    }
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
