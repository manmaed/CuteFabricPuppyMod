package net.manmaed.cutepuppymod;

import net.fabricmc.api.ClientModInitializer;
import net.manmaed.cutepuppymod.entity.CPMEntitys;

/**
 * Created by manmaed on 01/07/2019.
 */
public class CutePuppyModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CPMEntitys.clientEntitystuff();
    }
}
