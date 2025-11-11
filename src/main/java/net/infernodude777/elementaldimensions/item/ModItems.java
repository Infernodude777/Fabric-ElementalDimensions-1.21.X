package net.infernodude777.elementaldimensions.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.infernodude777.elementaldimensions.ElementalDimensions;
import net.infernodude777.elementaldimensions.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.swing.text.Element;

public class ModItems {
    public static final Item FIRE_ESSENCE = registerItem("fire_essence", new Item(new Item.Settings()));
    public static final Item WATER_ESSENCE = registerItem("water_essence", new Item(new Item.Settings()));
    public static final Item AIR_ESSENCE = registerItem("air_essence", new Item(new Item.Settings()));
    public static final Item EARTH_ESSENCE = registerItem("earth_essence", new Item(new Item.Settings()));
    public static final Item EARTH_INGOT = registerItem("earth_ingot", new Item(new Item.Settings()));
    public static final Item WATER_INGOT = registerItem("water_ingot", new Item(new Item.Settings()));
    public static final Item FIRE_INGOT = registerItem("fire_ingot", new Item(new Item.Settings()));
    public static final Item AIR_INGOT = registerItem("air_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ElementalDimensions.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ElementalDimensions.LOGGER.info("Registering Mod Items for " + ElementalDimensions.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(FIRE_ESSENCE);
            entries.add(WATER_ESSENCE);
            entries.add(AIR_ESSENCE);
            entries.add(EARTH_ESSENCE);
            entries.add(EARTH_INGOT);
            entries.add(WATER_INGOT);
            entries.add(FIRE_INGOT);
            entries.add(AIR_INGOT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.AIR_LATTICE);
        });
    }
}
