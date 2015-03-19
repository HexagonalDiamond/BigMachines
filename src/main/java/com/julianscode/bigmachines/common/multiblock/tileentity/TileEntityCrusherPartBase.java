package com.julianscode.bigmachines.common.multiblock.tileentity;


import com.julianscode.hexcore.multiblock.MultiblockControllerBase;
import com.julianscode.hexcore.multiblock.MultiblockTileEntityBase;
import com.julianscode.hexcore.multiblock.MultiblockValidationException;
import com.julianscode.hexcore.multiblock.rectangular.RectangularMultiblockTileEntityBase;

/**
 * Created by jmeyer2k on 3/18/15.
 */
public class TileEntityCrusherPartBase extends RectangularMultiblockTileEntityBase {
    @Override
    public void onMachineAssembled(MultiblockControllerBase multiblockControllerBase) {

    }

    @Override
    public void isGoodForFrame() throws MultiblockValidationException {

    }

    @Override
    public void isGoodForSides() throws MultiblockValidationException {

    }

    @Override
    public void isGoodForTop() throws MultiblockValidationException {

    }

    @Override
    public void isGoodForBottom() throws MultiblockValidationException {

    }

    @Override
    public void isGoodForInterior() throws MultiblockValidationException {

    }

    @Override
    public void onMachineBroken() {

    }

    @Override
    public void onMachineActivated() {

    }

    @Override
    public void onMachineDeactivated() {

    }

    @Override
    public Class<? extends MultiblockControllerBase> getMultiblockControllerType() {
        return TileEntityCrusherController.class;
    }

    @Override
    public MultiblockControllerBase createNewMultiblock() {
        return null;
    }
}
