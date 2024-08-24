package com.newmaa.othtech.machine.machineclass;

import com.github.technus.tectech.thing.metaTileEntity.multi.base.GT_MetaTileEntity_MultiblockBase_EM;

public abstract class TT_MultiMachineBase_EM extends GT_MetaTileEntity_MultiblockBase_EM {

    public TT_MultiMachineBase_EM(int aID, String aName, String aNameRegional) {
        super(aID, aName, aNameRegional);
    }

    public TT_MultiMachineBase_EM(String aName) {
        super(aName);
    }

    public void repairMachine() {
        mHardHammer = true;
        mSoftHammer = true;
        mScrewdriver = true;
        mCrowbar = true;
        mSolderingTool = true;
        mWrench = true;
    }

    /**
     * No more machine error
     */
    @Override
    public boolean doRandomMaintenanceDamage() {
        return true;
    }

    /**
     * No more machine error
     */
    @Override
    public void checkMaintenance() {}

    /**
     * No more machine error
     */
    @Override
    public boolean getDefaultHasMaintenanceChecks() {
        return false;
    }

    /**
     * No more machine error
     */
    @Override
    public final boolean shouldCheckMaintenance() {
        return false;
    }

}
