package io.github.stereo528;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;

import static io.github.stereo528.BlockRegister.FORGE_BLOCK;
import static io.github.stereo528.BlockRegister.OPAL_ORE;
import static io.github.stereo528.Main.*;

public class BlockItemRegister {
    public static void init() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "opal_ore"), new BlockItem(OPAL_ORE, new Item.Settings().group(GROUP)));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "forge"), new BlockItem(FORGE_BLOCK, new Item.Settings().group(GROUP)));

        log(Level.INFO, "All BlockItems Registered");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
