package com.nulldev.modbase.util;

import com.nulldev.modbase.blocks.BasicBlock;
import com.nulldev.modbase.blocks.BlockItemBase;
import com.nulldev.modbase.blocks.PinkSlimeBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.nulldev.modbase.ModBase.MODID;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items

    // Blocks
    public static final RegistryObject<Block> PINK_SLIME_BLOCK = BLOCKS.register("pink_slime_block", () -> new PinkSlimeBlock());

    // Block Items
    public static final RegistryObject<Item> PINK_SLIME_BLOCK_ITEM = ITEMS.register("pink_slime_block", () -> new BlockItemBase(PINK_SLIME_BLOCK.get()));

}
