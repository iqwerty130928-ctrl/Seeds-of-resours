package com.seedsofresources;

import java.util.function.Supplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SeedsOfResources.MODID);

    public static final Supplier<CreativeModeTab> MAIN = TABS.register("main", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + SeedsOfResources.MODID))
            .icon(() -> new ItemStack(ModItems.SEEDS.get(ResourceType.DIAMOND.id).get()))
            .displayItems((parameters, output) -> {
                for (DeferredItem<?> seed : ModItems.SEEDS.values()) {
                    output.accept(seed.get());
                }
            })
            .build());

    private ModCreativeTabs() {
    }
}
