package com.seedsofresources;

import java.util.LinkedHashMap;
import java.util.Map;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(SeedsOfResources.MODID);

    public static final Map<String, DeferredBlock<Block>> CROPS = new LinkedHashMap<>();

    static {
        for (ResourceType type : ResourceType.values()) {
            CROPS.put(type.id, BLOCKS.register(type.id + "_crop", () -> new ResourceCropBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT),
                    () -> ModItems.SEEDS.get(type.id).get())));
        }
    }

    private ModBlocks() {
    }
}
