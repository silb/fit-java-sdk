/////////////////////////////////////////////////////////////////////////////////////////////
// Copyright 2024 Garmin International, Inc.
// Licensed under the Flexible and Interoperable Data Transfer (FIT) Protocol License; you
// may not use this file except in compliance with the Flexible and Interoperable Data
// Transfer (FIT) Protocol License.
/////////////////////////////////////////////////////////////////////////////////////////////
// ****WARNING****  This file is auto-generated!  Do NOT edit this file.
// Profile Version = 21.133.0Release
// Tag = production/release/21.133.0-0-g6002091
/////////////////////////////////////////////////////////////////////////////////////////////


package com.garmin.fit;



public class ExdScreenConfigurationMesg extends Mesg   {

    
    public static final int ScreenIndexFieldNum = 0;
    
    public static final int FieldCountFieldNum = 1;
    
    public static final int LayoutFieldNum = 2;
    
    public static final int ScreenEnabledFieldNum = 3;
    

    protected static final  Mesg exdScreenConfigurationMesg;
    static {
        // exd_screen_configuration
        exdScreenConfigurationMesg = new Mesg("exd_screen_configuration", MesgNum.EXD_SCREEN_CONFIGURATION);
        exdScreenConfigurationMesg.addField(new Field("screen_index", ScreenIndexFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        exdScreenConfigurationMesg.addField(new Field("field_count", FieldCountFieldNum, 2, 1, 0, "", false, Profile.Type.UINT8));
        
        exdScreenConfigurationMesg.addField(new Field("layout", LayoutFieldNum, 0, 1, 0, "", false, Profile.Type.EXD_LAYOUT));
        
        exdScreenConfigurationMesg.addField(new Field("screen_enabled", ScreenEnabledFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        
    }

    public ExdScreenConfigurationMesg() {
        super(Factory.createMesg(MesgNum.EXD_SCREEN_CONFIGURATION));
    }

    public ExdScreenConfigurationMesg(final Mesg mesg) {
        super(mesg);
    }


    /**
     * Get screen_index field
     *
     * @return screen_index
     */
    public Short getScreenIndex() {
        return getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set screen_index field
     *
     * @param screenIndex The new screenIndex value to be set
     */
    public void setScreenIndex(Short screenIndex) {
        setFieldValue(0, 0, screenIndex, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get field_count field
     * Comment: number of fields in screen
     *
     * @return field_count
     */
    public Short getFieldCount() {
        return getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set field_count field
     * Comment: number of fields in screen
     *
     * @param fieldCount The new fieldCount value to be set
     */
    public void setFieldCount(Short fieldCount) {
        setFieldValue(1, 0, fieldCount, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get layout field
     *
     * @return layout
     */
    public ExdLayout getLayout() {
        Short value = getFieldShortValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return ExdLayout.getByValue(value);
    }

    /**
     * Set layout field
     *
     * @param layout The new layout value to be set
     */
    public void setLayout(ExdLayout layout) {
        setFieldValue(2, 0, layout.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get screen_enabled field
     *
     * @return screen_enabled
     */
    public Bool getScreenEnabled() {
        Short value = getFieldShortValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set screen_enabled field
     *
     * @param screenEnabled The new screenEnabled value to be set
     */
    public void setScreenEnabled(Bool screenEnabled) {
        setFieldValue(3, 0, screenEnabled.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
