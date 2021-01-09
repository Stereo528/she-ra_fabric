package io.github.stereo528.util;

import io.github.stereo528.ItemTypes.GiveItGlint;
import io.github.stereo528.tools.OpalAxeItem;
import io.github.stereo528.tools.OpalHoeItem;
import io.github.stereo528.tools.OpalPickItem;
import io.github.stereo528.tools.OpalTool;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.MOD_ID;
import static io.github.stereo528.Main.MOD_NAME;
import static io.github.stereo528.Main.GROUP;
import static io.github.stereo528.tools.OpalTool.INSTANCE;

public class ItemRegister {

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
    //Tools
    public static final ToolItem OPAL_SWORD = new SwordItem(INSTANCE, 5, -2.4f, new Item.Settings().group(GROUP));
    public static final ToolItem OPAL_SHOVEL = new ShovelItem(INSTANCE, 2, -3.0f, new Item.Settings().group(GROUP));
    public static final ToolItem OPAL_PICK = new OpalPickItem(INSTANCE, 4, -2.0f, new Item.Settings().group(GROUP));
    public static final ToolItem OPAL_AXE = new OpalAxeItem(INSTANCE, 7, -3.1f, new Item.Settings().group(GROUP));
    public static final ToolItem OPAL_HOE = new OpalHoeItem(INSTANCE, 1, -2.0f, new Item.Settings().group(GROUP));

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magic_stick"), STICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "strength_core"), CORE_S);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "movement_core"), CORE_M);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ranged_core"), CORE_R);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "agility_core"), CORE_A);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tele_core"), CORE_T);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_ingot"), INGOT_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "runestone"), RUNE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "enchanted_runestone"), RUNE_M);
        //Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_sword"), OPAL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_pickaxe"), OPAL_PICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_axe"), OPAL_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_shovel"), OPAL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_hoe"), OPAL_HOE);



        log(Level.INFO, "All Items Registered");

    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
