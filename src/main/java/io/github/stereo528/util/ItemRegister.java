package io.github.stereo528.util;

import io.github.stereo528.ArmorTypes.EtheriumArmor;
import io.github.stereo528.ItemTypes.GiveItGlint;
import io.github.stereo528.tools.SheRaAxeItem;
import io.github.stereo528.tools.SheRaHoeItem;
import io.github.stereo528.tools.SheRaPickItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
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
import static io.github.stereo528.tools.EtheriumTool.ETHERIUM_TOOL;
import static io.github.stereo528.tools.OpalTool.OPAL_TOOL;

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
    public static final Item INGOT_S = new Item(new FabricItemSettings().group(GROUP));
    public static final Item INGOT_T = new Item(new FabricItemSettings().group(GROUP));
    public static final Item RUNE = new Item(new FabricItemSettings().group(GROUP));
    public static final Item RUNE_M = new GiveItGlint(new FabricItemSettings().group(GROUP).maxCount(16).rarity(Rarity.RARE));
    public static final Item DARK_BRICK = new Item(new FabricItemSettings().group(GROUP));



    //Tools
        //OPAL
    public static final ToolItem SWORD_O = new SwordItem(OPAL_TOOL, 5, -2.4f, new Item.Settings().group(GROUP));
    public static final ToolItem SHOVEL_O = new ShovelItem(OPAL_TOOL, 2, -3.0f, new Item.Settings().group(GROUP));
    public static final ToolItem PICK_O = new SheRaPickItem(OPAL_TOOL, 4, -2.0f, new Item.Settings().group(GROUP));
    public static final ToolItem AXE_O = new SheRaAxeItem(OPAL_TOOL, 7, -3.1f, new Item.Settings().group(GROUP));
    public static final ToolItem HOE_O = new SheRaHoeItem(OPAL_TOOL, 1, -2.0f, new Item.Settings().group(GROUP));
        //ETHERIUM
    public static final ToolItem SWORD_E = new SwordItem(ETHERIUM_TOOL, 5, -2.2f, new Item.Settings().group(GROUP));
    public static final ToolItem SHOVEL_E = new ShovelItem(ETHERIUM_TOOL, 2, -2.8f, new Item.Settings().group(GROUP));
    public static final ToolItem PICK_E = new SheRaPickItem(ETHERIUM_TOOL, 4, -1.8f, new Item.Settings().group(GROUP));
    public static final ToolItem AXE_E = new SheRaAxeItem(ETHERIUM_TOOL, 3, -2.9f, new Item.Settings().group(GROUP));
    public static final ToolItem HOE_E = new SheRaHoeItem(ETHERIUM_TOOL, 1, -1.8f, new Item.Settings().group(GROUP));
    //Armor
        //ETHERIUM
    public static final ArmorMaterial etheriumArmor = new EtheriumArmor();
    public static final Item HELMET_E = new ArmorItem(etheriumArmor, EquipmentSlot.HEAD, new Item.Settings().group(GROUP).fireproof());
    public static final Item CHEST_E = new ArmorItem(etheriumArmor, EquipmentSlot.CHEST, new Item.Settings().group(GROUP).fireproof());
    public static final Item LEGS_E = new ArmorItem(etheriumArmor, EquipmentSlot.LEGS, new Item.Settings().group(GROUP).fireproof());
    public static final Item FEET_E = new ArmorItem(etheriumArmor, EquipmentSlot.FEET, new Item.Settings().group(GROUP).fireproof());

    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "magic_stick"), STICK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal"), OPAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "strength_core"), CORE_S);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "movement_core"), CORE_M);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "ranged_core"), CORE_R);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "agility_core"), CORE_A);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "tele_core"), CORE_T);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_ingot"), INGOT_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), INGOT_S);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "titanium_ingot"), INGOT_T);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "runestone"), RUNE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "enchanted_runestone"), RUNE_M);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_brick"), DARK_BRICK);
        //Tools
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_sword"), SWORD_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_pickaxe"), PICK_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_axe"), AXE_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_shovel"), SHOVEL_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_hoe"), HOE_O);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_sword"), SWORD_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_pickaxe"), PICK_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_axe"), AXE_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_shovel"), SHOVEL_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_hoe"), HOE_E);
        //Armor
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_helmet"), HELMET_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_chestplate"), CHEST_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_leggings"), LEGS_E);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_boots"), FEET_E);



        log(Level.INFO, "All Items Registered");

    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
