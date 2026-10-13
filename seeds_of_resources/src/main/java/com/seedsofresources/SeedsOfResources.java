package com.seedsofresources;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(SeedsOfResources.MODID)
public class SeedsOfResources {
    public static final String MODID = "seeds_of_resources";

    public SeedsOfResources(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModCreativeTabs.TABS.register(modEventBus);
    }
}
