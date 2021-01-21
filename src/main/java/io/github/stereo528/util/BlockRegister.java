package io.github.stereo528.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.MOD_ID;
import static io.github.stereo528.Main.MOD_NAME;

public class BlockRegister {
    public static Logger LOGGER = LogManager.getLogger();

    //General Blocks
    public static final Block OPAL_ORE = new Block(FabricBlockSettings.of(Material.STONE).hardness(4.0f).requiresTool());
    public static final Block DARK_BRICKS = new Block(FabricBlockSettings.of(Material.STONE).hardness(8.0f).requiresTool());

    //Horde Blocks
    public static final Block HORDE_PIPES = new Block(FabricBlockSettings.of(Material.STONE).hardness(5.0f).requiresTool());
    public static final Block HORDE_WALL_1 = new Block(FabricBlockSettings.of(Material.STONE).hardness(5.0f).requiresTool());
    public static final Block HORDE_WALL_2 = new Block(FabricBlockSettings.of(Material.STONE).hardness(5.0f).requiresTool());
    public static final Block HORDE_WALL_3 = new Block(FabricBlockSettings.of(Material.STONE).hardness(5.0f).requiresTool());

    //Material Blocks
    public static final Block OPAL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(4.0f).requiresTool());
    public static final Block ETHERIUM_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(12.0f).requiresTool());
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(8.0f).requiresTool());
    public static final Block TITANIUM_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).hardness(8.0f).requiresTool());



    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "opal_ore"), OPAL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "dark_bricks"), DARK_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "opal_block"), OPAL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "etherium_block"), ETHERIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "titanium_block"), TITANIUM_BLOCK);

        log(Level.INFO, "All Blocks Registered");
    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
