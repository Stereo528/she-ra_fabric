package io.github.stereo528.util;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static io.github.stereo528.Main.MOD_ID;
import static io.github.stereo528.Main.MOD_NAME;

public class OreGen {
    public static Logger LOGGER = LogManager.getLogger();


    private static ConfiguredFeature<?, ?> OPAL_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegister.OPAL_ORE.getDefaultState(), 3))
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 15)))
            .spreadHorizontally()
            .repeat(8);

    public static void init() {
        RegistryKey<ConfiguredFeature<?, ?>> oreOpalOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier(MOD_ID, "opal_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreOpalOverworld.getValue(), OPAL_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, oreOpalOverworld);

        log(Level.INFO, "Added Ore Gen Features");
    }
    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }
}
