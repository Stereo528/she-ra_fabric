package io.github.stereo528;

import io.github.stereo528.ItemTypes.GiveItGlint;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.MOD_ID;
import static io.github.stereo528.Main.MOD_NAME;
import static io.github.stereo528.Main.GROUP;

public class ItemRegistar {

    public static Logger LOGGER = LogManager.getLogger();


    public static final Item STICK = new Item(new FabricItemSettings().group(GROUP));
    public static final Item OPAL = new Item(new FabricItemSettings().group(GROUP));
    public static final Item CORE_S = new Item(new FabricItemSettings().group(GROUP));
    public static final Item CORE_M = new Item(new FabricItemSettings().group(GROUP));
    public static final Item CORE_A = new Item(new FabricItemSettings().group(GROUP));
    public static final Item CORE_R = new Item(new FabricItemSettings().group(GROUP));
    public static final Item CORE_T = new Item(new FabricItemSettings().group(GROUP));
    public static final Item INGOT_E = new Item(new FabricItemSettings().group(GROUP));
    public static final Item RUNE = new Item(new FabricItemSettings().group(GROUP));
    public static final Item RUNE_M = new GiveItGlint(new FabricItemSettings().group(GROUP).maxCount(16).rarity(Rarity.RARE));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magic_stick"), STICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "strength_core"), CORE_S);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "movement_core"), CORE_M);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ranged_core"), CORE_R);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "agility_core"), CORE_A);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_ingot"), INGOT_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "runestone"), RUNE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "enchanted_runestone"), RUNE_M);
        log(Level.INFO, "All Items Registered");

    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
