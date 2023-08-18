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



public class HrvValueMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int ValueFieldNum = 0;
    

    protected static final  Mesg hrvValueMesg;
    static {
        // hrv_value
        hrvValueMesg = new Mesg("hrv_value", MesgNum.HRV_VALUE);
        hrvValueMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        hrvValueMesg.addField(new Field("value", ValueFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
    }

    public HrvValueMesg() {
        super(Factory.createMesg(MesgNum.HRV_VALUE));
    }

    public HrvValueMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get timestamp field
     *
     * @return timestamp
     */
    public DateTime getTimestamp() {
        return timestampToDateTime(getFieldLongValue(253, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set timestamp field
     *
     * @param timestamp The new timestamp value to be set
     */
    public void setTimestamp(DateTime timestamp) {
        setFieldValue(253, 0, timestamp.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get value field
     * Units: ms
     * Comment: 5 minute RMSSD
     *
     * @return value
     */
    public Float getValue() {
        return getFieldFloatValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set value field
     * Units: ms
     * Comment: 5 minute RMSSD
     *
     * @param value The new value value to be set
     */
    public void setValue(Float value) {
        setFieldValue(0, 0, value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
