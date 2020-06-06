package com.su5ed.testmod.items;

import com.su5ed.testmod.TestMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;

public class FirstItem extends PickaxeItem {
    public FirstItem() {
        super(ItemTier.IRON, 1, 0.6F, new Item.Properties().group(TestMod.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
