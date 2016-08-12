package com.xenry.matter.world;

import com.xenry.matter.block.BlockRegister;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * mod1 created by Henry Jake on December 20, 2015.
 * Copyright 2015 Henry Jake.
 * All content in this file may not be used without written consent of Henry Jake.
 */
public final class GeneratorRegister implements IWorldGenerator {

    public static WorldGenMinable rubyGenerator;

    public GeneratorRegister(){
        rubyGenerator = new WorldGenMinable(BlockRegister.rubyOreBlock.getDefaultState(), 7);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case 0:
                this.runGenerator(rubyGenerator, world, random, chunkX, chunkZ, 1, 1, 12);
                break;
            default: break;
        }
    }

    private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = minHeight + random.nextInt(heightDiff);
            int z = chunkZ * 16 + random.nextInt(16);
            generator.generate(world, random, new BlockPos(x, y, z));
        }
    }

}
