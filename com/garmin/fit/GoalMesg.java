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



public class GoalMesg extends Mesg   {

    
    public static final int MessageIndexFieldNum = 254;
    
    public static final int SportFieldNum = 0;
    
    public static final int SubSportFieldNum = 1;
    
    public static final int StartDateFieldNum = 2;
    
    public static final int EndDateFieldNum = 3;
    
    public static final int TypeFieldNum = 4;
    
    public static final int ValueFieldNum = 5;
    
    public static final int RepeatFieldNum = 6;
    
    public static final int TargetValueFieldNum = 7;
    
    public static final int RecurrenceFieldNum = 8;
    
    public static final int RecurrenceValueFieldNum = 9;
    
    public static final int EnabledFieldNum = 10;
    
    public static final int SourceFieldNum = 11;
    

    protected static final  Mesg goalMesg;
    static {
        // goal
        goalMesg = new Mesg("goal", MesgNum.GOAL);
        goalMesg.addField(new Field("message_index", MessageIndexFieldNum, 132, 1, 0, "", false, Profile.Type.MESSAGE_INDEX));
        
        goalMesg.addField(new Field("sport", SportFieldNum, 0, 1, 0, "", false, Profile.Type.SPORT));
        
        goalMesg.addField(new Field("sub_sport", SubSportFieldNum, 0, 1, 0, "", false, Profile.Type.SUB_SPORT));
        
        goalMesg.addField(new Field("start_date", StartDateFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        goalMesg.addField(new Field("end_date", EndDateFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        goalMesg.addField(new Field("type", TypeFieldNum, 0, 1, 0, "", false, Profile.Type.GOAL));
        
        goalMesg.addField(new Field("value", ValueFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
        goalMesg.addField(new Field("repeat", RepeatFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        
        goalMesg.addField(new Field("target_value", TargetValueFieldNum, 134, 1, 0, "", false, Profile.Type.UINT32));
        
        goalMesg.addField(new Field("recurrence", RecurrenceFieldNum, 0, 1, 0, "", false, Profile.Type.GOAL_RECURRENCE));
        
        goalMesg.addField(new Field("recurrence_value", RecurrenceValueFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        
        goalMesg.addField(new Field("enabled", EnabledFieldNum, 0, 1, 0, "", false, Profile.Type.BOOL));
        
        goalMesg.addField(new Field("source", SourceFieldNum, 0, 1, 0, "", false, Profile.Type.GOAL_SOURCE));
        
    }

    public GoalMesg() {
        super(Factory.createMesg(MesgNum.GOAL));
    }

    public GoalMesg(final Mesg mesg) {
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
     * Get sport field
     *
     * @return sport
     */
    public Sport getSport() {
        Short value = getFieldShortValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Sport.getByValue(value);
    }

    /**
     * Set sport field
     *
     * @param sport The new sport value to be set
     */
    public void setSport(Sport sport) {
        setFieldValue(0, 0, sport.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get sub_sport field
     *
     * @return sub_sport
     */
    public SubSport getSubSport() {
        Short value = getFieldShortValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return SubSport.getByValue(value);
    }

    /**
     * Set sub_sport field
     *
     * @param subSport The new subSport value to be set
     */
    public void setSubSport(SubSport subSport) {
        setFieldValue(1, 0, subSport.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get start_date field
     *
     * @return start_date
     */
    public DateTime getStartDate() {
        return timestampToDateTime(getFieldLongValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set start_date field
     *
     * @param startDate The new startDate value to be set
     */
    public void setStartDate(DateTime startDate) {
        setFieldValue(2, 0, startDate.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get end_date field
     *
     * @return end_date
     */
    public DateTime getEndDate() {
        return timestampToDateTime(getFieldLongValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD));
    }

    /**
     * Set end_date field
     *
     * @param endDate The new endDate value to be set
     */
    public void setEndDate(DateTime endDate) {
        setFieldValue(3, 0, endDate.getTimestamp(), Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get type field
     *
     * @return type
     */
    public Goal getType() {
        Short value = getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Goal.getByValue(value);
    }

    /**
     * Set type field
     *
     * @param type The new type value to be set
     */
    public void setType(Goal type) {
        setFieldValue(4, 0, type.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get value field
     *
     * @return value
     */
    public Long getValue() {
        return getFieldLongValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set value field
     *
     * @param value The new value value to be set
     */
    public void setValue(Long value) {
        setFieldValue(5, 0, value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get repeat field
     *
     * @return repeat
     */
    public Bool getRepeat() {
        Short value = getFieldShortValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set repeat field
     *
     * @param repeat The new repeat value to be set
     */
    public void setRepeat(Bool repeat) {
        setFieldValue(6, 0, repeat.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get target_value field
     *
     * @return target_value
     */
    public Long getTargetValue() {
        return getFieldLongValue(7, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set target_value field
     *
     * @param targetValue The new targetValue value to be set
     */
    public void setTargetValue(Long targetValue) {
        setFieldValue(7, 0, targetValue, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get recurrence field
     *
     * @return recurrence
     */
    public GoalRecurrence getRecurrence() {
        Short value = getFieldShortValue(8, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return GoalRecurrence.getByValue(value);
    }

    /**
     * Set recurrence field
     *
     * @param recurrence The new recurrence value to be set
     */
    public void setRecurrence(GoalRecurrence recurrence) {
        setFieldValue(8, 0, recurrence.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get recurrence_value field
     *
     * @return recurrence_value
     */
    public Integer getRecurrenceValue() {
        return getFieldIntegerValue(9, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set recurrence_value field
     *
     * @param recurrenceValue The new recurrenceValue value to be set
     */
    public void setRecurrenceValue(Integer recurrenceValue) {
        setFieldValue(9, 0, recurrenceValue, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get enabled field
     *
     * @return enabled
     */
    public Bool getEnabled() {
        Short value = getFieldShortValue(10, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return Bool.getByValue(value);
    }

    /**
     * Set enabled field
     *
     * @param enabled The new enabled value to be set
     */
    public void setEnabled(Bool enabled) {
        setFieldValue(10, 0, enabled.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get source field
     *
     * @return source
     */
    public GoalSource getSource() {
        Short value = getFieldShortValue(11, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return GoalSource.getByValue(value);
    }

    /**
     * Set source field
     *
     * @param source The new source value to be set
     */
    public void setSource(GoalSource source) {
        setFieldValue(11, 0, source.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
