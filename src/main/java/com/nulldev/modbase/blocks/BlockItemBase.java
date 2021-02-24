package com.nulldev.modbase.blocks;

import com.nulldev.modbase.ModBase;
import com.nulldev.modbase.ModBase;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {


    public BlockItemBase(Block block) {
        super(block, new Properties().group(ModBase.TAB));
    }
}
