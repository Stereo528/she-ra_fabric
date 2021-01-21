package io.github.stereo528;

import io.github.stereo528.util.BlockItemRegister;
import io.github.stereo528.util.BlockRegister;
import io.github.stereo528.util.ItemRegister;
import io.github.stereo528.util.OreGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.util.ItemRegister.RUNE;

public class Main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "she_ra";
    public static final String MOD_NAME = "She-Ra: Minecraft Edition";

    public static final ItemGroup GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "igroup"))
            .icon(() -> new ItemStack(RUNE))
            .build();

    @Override
    public void onInitialize() {
        BlockRegister.init();
        BlockItemRegister.init();
        ItemRegister.init();

        OreGen.init();
        log(Level.INFO, "For the Honor of Grayskull!");
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}