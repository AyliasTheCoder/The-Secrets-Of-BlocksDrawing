package com.nulldev.modbase.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PinkSlimeBlock extends SlimeBlock {

    public PinkSlimeBlock() {
        super(AbstractBlock.Properties.create(Material.SPONGE).hardnessAndResistance(0, 1));
    }

    @Override
    public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) {
        double x = entityIn.getMotion().getX();
        double y = entityIn.getMotion().getY() * 1.75;
        double z = entityIn.getMotion().getZ();


        entityIn.setMotion(x, y, z);
        super.onFallenUpon(worldIn, pos, entityIn, fallDistance);
    }

    @Override
    public boolean isSlimeBlock(BlockState state) {
        return true;
    }

    @Override
    public boolean isStickyBlock(BlockState state) {
        return true;
    }

    @Override
    public boolean canStickTo(BlockState state, BlockState other) {
        return true;
    }


}
