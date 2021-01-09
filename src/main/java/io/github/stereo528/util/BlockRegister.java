package io.github.stereo528.util;

import io.github.stereo528.forge.Forge;
import io.github.stereo528.forge.ForgeBlock;
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
    public static final Block FORGE_BLOCK = new ForgeBlock(FabricBlockSettings.of(Material.METAL).hardness(10.0f));
    public static BlockEntityType<Forge> FORGE_BLOCK_ENTITY;



    public static void init() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "opal_ore"), OPAL_ORE);
        FORGE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "she_ra:forge", BlockEntityType.Builder.create(Forge::new, FORGE_BLOCK).build(null));

        log(Level.INFO, "All Blocks Registered");
    }
    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
}
