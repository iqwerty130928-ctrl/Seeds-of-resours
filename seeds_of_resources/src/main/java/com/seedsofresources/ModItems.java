package com.seedsofresources;

import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SeedsOfResources.MODID);

    public static final Map<String, DeferredItem<Item>> SEEDS = new LinkedHashMap<>();

    static {
        for (ResourceType type : ResourceType.values()) {
            SEEDS.put(type.id, ITEMS.register(type.id + "_seed", () -> new ItemNameBlockItem(
                    ModBlocks.CROPS.get(type.id).get(), new Item.Properties())));
        }
    }

    private ModItems() {
    }
}
