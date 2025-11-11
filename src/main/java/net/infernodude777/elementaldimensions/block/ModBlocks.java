
package net.infernodude777.elementaldimensions.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.infernodude777.elementaldimensions.ElementalDimensions;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.core.pattern.AbstractStyleNameConverter;

public class ModBlocks {

    public static final Block AIR_LATTICE = registerBlock("air_lattice",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block MOSSY_GLASS = registerBlock("mossy_glass",
            new StainedGlassBlock(DyeColor.GREEN, AbstractBlock.Settings.create()
                    .strength(1f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.GLASS)));
    public static final Block GAIA_STONE = registerBlock("gaia_stone",
            new Block(AbstractBlock.Settings.create().strength(2.5F, 6.0F)
                    .requiresTool().sounds(BlockSoundGroup.STONE).mapColor(MapColor.EMERALD_GREEN)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ElementalDimensions.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ElementalDimensions.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ElementalDimensions.LOGGER.info("Registering Mod Blocks for " + ElementalDimensions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.AIR_LATTICE);
            entries.add(ModBlocks.MOSSY_GLASS);
        });
    }
}
