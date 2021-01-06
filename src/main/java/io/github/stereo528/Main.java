package io.github.stereo528;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "she_ra";
    public static final String MOD_NAME = "she-ra-fabric";

    public static final ItemGroup GROUP = FabricItemGroupBuilder.create(
            new Identifier("she_ra", "she_ra_igroup"))
            .icon(()-> new ItemStack(Items.ITEM_FRAME))
            .build();

    //Item Types
    public static final Item ITEMS = new Item(new FabricItemSettings().group(GROUP));



    @Override
    public void onInitialize() {
        log(Level.INFO, "---------");
        log(Level.INFO, "She-Ra Mod");
        log(Level.INFO, "---------");
        //TODO: Initializer
        Registry.register(Registry.ITEM, new Identifier("she_ra", "magic_stick"), ITEMS);
    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}