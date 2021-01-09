package io.github.stereo528.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.MOD_ID;
import static io.github.stereo528.Main.MOD_NAME;

public class BlockRegister {
    public static Logger LOGGER = LogManager.getLogger();

    public static final Block OPAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f));



    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "opal_ore"), OPAL_ORE);

        log(Level.INFO, "All Blocks Registered");
    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
