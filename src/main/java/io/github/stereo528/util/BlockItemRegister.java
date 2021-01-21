package io.github.stereo528.util;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.*;
import static io.github.stereo528.util.BlockRegister.*;

public class BlockItemRegister {
    public static Logger LOGGER = LogManager.getLogger();
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_ore"), new BlockItem(OPAL_ORE, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "dark_bricks"), new BlockItem(DARK_BRICKS, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_block"), new BlockItem(OPAL_BLOCK, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "etherium_block"), new BlockItem(ETHERIUM_BLOCK, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "titanium_block"), new BlockItem(TITANIUM_BLOCK, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), new BlockItem(STEEL_BLOCK, new Item.Settings().group(GROUP)));



        log(Level.INFO, "All BlockItems Registered");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
