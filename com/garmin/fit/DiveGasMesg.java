/////////////////////////////////////////////////////////////////////////////////////////////
// Copyright 2023 Garmin International, Inc.
// Licensed under the Flexible and Interoperable Data Transfer (FIT) Protocol License; you
// may not use this file except in compliance with the Flexible and Interoperable Data
// Transfer (FIT) Protocol License.
/////////////////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.120Release
// Tag = production/release/21.120.00-0-g2d77811
/////////////////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;



public class DiveGasMesg extends Mesg   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int HeliumContentFieldNum = 0;
    
    public static final int OxygenContentFieldNum = 1;
    
    public static final int StatusFieldNum = 2;
    
    public static final int ModeFieldNum = 3;
    

    protected static final  Mesg diveGasMesg;
    static {
        // dive_gas
        diveGasMesg = new Mesg("dive_gas", MesgNum.DIVE_GAS);
        diveGasMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
        diveGasMesg.addField(new Field("helium_content", HeliumContentFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        
        diveGasMesg.addField(new Field("oxygen_content", OxygenContentFieldNum, 2, 1, 0, "percent", false, Profile.Type.UINT8));
        
        diveGasMesg.addField(new Field("status", StatusFieldNum, 0, 1, 0, "", false, Profile.Type.DIVE_GAS_STATUS));
        
        diveGasMesg.addField(new Field("mode", ModeFieldNum, 0, 1, 0, "", false, Profile.Type.DIVE_GAS_MODE));
        
    }

    public DiveGasMesg() {
        super(Factory.createMesg(MesgNum.DIVE_GAS));
    }

    public DiveGasMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get message_index field
     *
     * @return message_index
     */
    public Integer getMessageIndex() {
        return getFieldIntegerValue(254, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set message_index field
     *
     * @param messageIndex The new messageIndex value to be set
     */
    public void setMessageIndex(Integer messageIndex) {
        setFieldValue(254, 0, messageIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get helium_content field
     * Units: percent
     *
     * @return helium_content
     */
    public Short getHeliumContent() {
        return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set helium_content field
     * Units: percent
     *
     * @param heliumContent The new heliumContent value to be set
     */
    public void setHeliumContent(Short heliumContent) {
        setFieldValue(0, 0, heliumContent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get oxygen_content field
     * Units: percent
     *
     * @return oxygen_content
     */
    public Short getOxygenContent() {
        return getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set oxygen_content field
     * Units: percent
     *
     * @param oxygenContent The new oxygenContent value to be set
     */
    public void setOxygenContent(Short oxygenContent) {
        setFieldValue(1, 0, oxygenContent, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get status field
     *
     * @return status
     */
    public DiveGasStatus getStatus() {
        Short value = getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return DiveGasStatus.getByValue(value);
    }

    /**
     * Set status field
     *
     * @param status The new status value to be set
     */
    public void setStatus(DiveGasStatus status) {
        setFieldValue(2, 0, status.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get mode field
     *
     * @return mode
     */
    public DiveGasMode getMode() {
        Short value = getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return DiveGasMode.getByValue(value);
    }

    /**
     * Set mode field
     *
     * @param mode The new mode value to be set
     */
    public void setMode(DiveGasMode mode) {
        setFieldValue(3, 0, mode.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
