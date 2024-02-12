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



public class HrvStatusSummaryMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int WeeklyAverageFieldNum = 0;
    
    public static final int LastNightAverageFieldNum = 1;
    
    public static final int LastNight5MinHighFieldNum = 2;
    
    public static final int BaselineLowUpperFieldNum = 3;
    
    public static final int BaselineBalancedLowerFieldNum = 4;
    
    public static final int BaselineBalancedUpperFieldNum = 5;
    
    public static final int StatusFieldNum = 6;
    

    protected static final  Mesg hrvStatusSummaryMesg;
    static {
        // hrv_status_summary
        hrvStatusSummaryMesg = new Mesg("hrv_status_summary", MesgNum.HRV_STATUS_SUMMARY);
        hrvStatusSummaryMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        hrvStatusSummaryMesg.addField(new Field("weekly_average", WeeklyAverageFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("last_night_average", LastNightAverageFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("last_night_5_min_high", LastNight5MinHighFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("baseline_low_upper", BaselineLowUpperFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("baseline_balanced_lower", BaselineBalancedLowerFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("baseline_balanced_upper", BaselineBalancedUpperFieldNum, 132, 128, 0, "ms", false, Profile.Type.UINT16));
        
        hrvStatusSummaryMesg.addField(new Field("status", StatusFieldNum, 0, 1, 0, "", false, Profile.Type.HRV_STATUS));
        
    }

    public HrvStatusSummaryMesg() {
        super(Factory.createMesg(MesgNum.HRV_STATUS_SUMMARY));
    }

    public HrvStatusSummaryMesg(final Mesg mesg) {
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
     * Get weekly_average field
     * Units: ms
     * Comment: 7 day RMSSD average over sleep
     *
     * @return weekly_average
     */
    public Float getWeeklyAverage() {
        return getFieldFloatValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set weekly_average field
     * Units: ms
     * Comment: 7 day RMSSD average over sleep
     *
     * @param weeklyAverage The new weeklyAverage value to be set
     */
    public void setWeeklyAverage(Float weeklyAverage) {
        setFieldValue(0, 0, weeklyAverage, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get last_night_average field
     * Units: ms
     * Comment: Last night RMSSD average over sleep
     *
     * @return last_night_average
     */
    public Float getLastNightAverage() {
        return getFieldFloatValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set last_night_average field
     * Units: ms
     * Comment: Last night RMSSD average over sleep
     *
     * @param lastNightAverage The new lastNightAverage value to be set
     */
    public void setLastNightAverage(Float lastNightAverage) {
        setFieldValue(1, 0, lastNightAverage, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get last_night_5_min_high field
     * Units: ms
     * Comment: 5 minute high RMSSD value over sleep
     *
     * @return last_night_5_min_high
     */
    public Float getLastNight5MinHigh() {
        return getFieldFloatValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set last_night_5_min_high field
     * Units: ms
     * Comment: 5 minute high RMSSD value over sleep
     *
     * @param lastNight5MinHigh The new lastNight5MinHigh value to be set
     */
    public void setLastNight5MinHigh(Float lastNight5MinHigh) {
        setFieldValue(2, 0, lastNight5MinHigh, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get baseline_low_upper field
     * Units: ms
     * Comment: 3 week baseline, upper boundary of low HRV status
     *
     * @return baseline_low_upper
     */
    public Float getBaselineLowUpper() {
        return getFieldFloatValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set baseline_low_upper field
     * Units: ms
     * Comment: 3 week baseline, upper boundary of low HRV status
     *
     * @param baselineLowUpper The new baselineLowUpper value to be set
     */
    public void setBaselineLowUpper(Float baselineLowUpper) {
        setFieldValue(3, 0, baselineLowUpper, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get baseline_balanced_lower field
     * Units: ms
     * Comment: 3 week baseline, lower boundary of balanced HRV status
     *
     * @return baseline_balanced_lower
     */
    public Float getBaselineBalancedLower() {
        return getFieldFloatValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set baseline_balanced_lower field
     * Units: ms
     * Comment: 3 week baseline, lower boundary of balanced HRV status
     *
     * @param baselineBalancedLower The new baselineBalancedLower value to be set
     */
    public void setBaselineBalancedLower(Float baselineBalancedLower) {
        setFieldValue(4, 0, baselineBalancedLower, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get baseline_balanced_upper field
     * Units: ms
     * Comment: 3 week baseline, upper boundary of balanced HRV status
     *
     * @return baseline_balanced_upper
     */
    public Float getBaselineBalancedUpper() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set baseline_balanced_upper field
     * Units: ms
     * Comment: 3 week baseline, upper boundary of balanced HRV status
     *
     * @param baselineBalancedUpper The new baselineBalancedUpper value to be set
     */
    public void setBaselineBalancedUpper(Float baselineBalancedUpper) {
        setFieldValue(5, 0, baselineBalancedUpper, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get status field
     *
     * @return status
     */
    public HrvStatus getStatus() {
        Short value = getFieldShortValue(6, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return HrvStatus.getByValue(value);
    }

    /**
     * Set status field
     *
     * @param status The new status value to be set
     */
    public void setStatus(HrvStatus status) {
        setFieldValue(6, 0, status.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}
