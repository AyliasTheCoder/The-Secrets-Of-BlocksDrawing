package com.nulldev.modbase.items;

import com.nulldev.modbase.ModBase;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(ModBase.TAB));
    }
}
