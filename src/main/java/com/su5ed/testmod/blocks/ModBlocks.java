package com.su5ed.testmod.blocks;

import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

import java.awt.*;

public class ModBlocks {

    @ObjectHolder ("testmod:firstblock")
    public static  FirstBlock FIRSTBLOCK;

    @ObjectHolder("testmod:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;

    @ObjectHolder("testmod:firstblock")
    public static ContainerType<FirstBlockContainer> FIRSTBLOCK_CONTAINER;
}
