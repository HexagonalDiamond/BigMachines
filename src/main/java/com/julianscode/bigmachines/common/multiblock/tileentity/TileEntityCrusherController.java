package com.julianscode.bigmachines.common.multiblock.tileentity;

import com.julianscode.hexcore.multiblock.IMultiblockPart;
import com.julianscode.hexcore.multiblock.MultiblockControllerBase;
import com.julianscode.hexcore.multiblock.MultiblockValidationException;
import com.julianscode.hexcore.multiblock.rectangular.RectangularMultiblockControllerBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Created by jmeyer2k on 3/18/15.
 */
public class TileEntityCrusherController extends RectangularMultiblockControllerBase {

    public TileEntityCrusherController(World world) {
        super(world);
    }

    @Override
    public void onAttachedPartWithMultiblockData(IMultiblockPart part, NBTTagCompound data) {

    }

    @Override
    protected void onBlockAdded(IMultiblockPart newPart) {

    }

    @Override
    protected void onBlockRemoved(IMultiblockPart oldPart) {

    }

    @Override
    protected void onMachineAssembled() {

    }

    @Override
    protected void onMachineRestored() {

    }

    @Override
    protected void onMachinePaused() {

    }

    @Override
    protected void onMachineDisassembled() {

    }

    @Override
    protected int getMinimumNumberOfBlocksForAssembledMachine() {
        return 0;
    }

    @Override
    protected int getMaximumXSize() {
        return 0;
    }

    @Override
    protected int getMaximumZSize() {
        return 0;
    }

    @Override
    protected int getMaximumYSize() {
        return 0;
    }

    @Override
    protected void isMachineWhole() throws MultiblockValidationException {

    }

    @Override
    protected void onAssimilate(MultiblockControllerBase assimilated) {

    }

    @Override
    protected void onAssimilated(MultiblockControllerBase assimilator) {

    }

    @Override
    protected boolean updateServer() {
        return false;
    }

    @Override
    protected void updateClient() {

    }

    @Override
    public void writeToNBT(NBTTagCompound data) {

    }

    @Override
    public void readFromNBT(NBTTagCompound data) {

    }

    @Override
    public void formatDescriptionPacket(NBTTagCompound data) {

    }

    @Override
    public void decodeDescriptionPacket(NBTTagCompound data) {

    }
}
