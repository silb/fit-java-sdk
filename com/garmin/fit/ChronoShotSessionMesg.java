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



public class ChronoShotSessionMesg extends Mesg   {

    
    public static final int TimestampFieldNum = 253;
    
    public static final int MinSpeedFieldNum = 0;
    
    public static final int MaxSpeedFieldNum = 1;
    
    public static final int AvgSpeedFieldNum = 2;
    
    public static final int ShotCountFieldNum = 3;
    
    public static final int ProjectileTypeFieldNum = 4;
    
    public static final int GrainWeightFieldNum = 5;
    

    protected static final  Mesg chronoShotSessionMesg;
    static {
        // chrono_shot_session
        chronoShotSessionMesg = new Mesg("chrono_shot_session", MesgNum.CHRONO_SHOT_SESSION);
        chronoShotSessionMesg.addField(new Field("timestamp", TimestampFieldNum, 134, 1, 0, "", false, Profile.Type.DATE_TIME));
        
        chronoShotSessionMesg.addField(new Field("min_speed", MinSpeedFieldNum, 134, 1000, 0, "m/s", false, Profile.Type.UINT32));
        
        chronoShotSessionMesg.addField(new Field("max_speed", MaxSpeedFieldNum, 134, 1000, 0, "m/s", false, Profile.Type.UINT32));
        
        chronoShotSessionMesg.addField(new Field("avg_speed", AvgSpeedFieldNum, 134, 1000, 0, "m/s", false, Profile.Type.UINT32));
        
        chronoShotSessionMesg.addField(new Field("shot_count", ShotCountFieldNum, 132, 1, 0, "", false, Profile.Type.UINT16));
        
        chronoShotSessionMesg.addField(new Field("projectile_type", ProjectileTypeFieldNum, 0, 1, 0, "", false, Profile.Type.PROJECTILE_TYPE));
        
        chronoShotSessionMesg.addField(new Field("grain_weight", GrainWeightFieldNum, 134, 10, 0, "gr", false, Profile.Type.UINT32));
        
    }

    public ChronoShotSessionMesg() {
        super(Factory.createMesg(MesgNum.CHRONO_SHOT_SESSION));
    }

    public ChronoShotSessionMesg(final Mesg mesg) {
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
     * Get min_speed field
     * Units: m/s
     *
     * @return min_speed
     */
    public Float getMinSpeed() {
        return getFieldFloatValue(0, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set min_speed field
     * Units: m/s
     *
     * @param minSpeed The new minSpeed value to be set
     */
    public void setMinSpeed(Float minSpeed) {
        setFieldValue(0, 0, minSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get max_speed field
     * Units: m/s
     *
     * @return max_speed
     */
    public Float getMaxSpeed() {
        return getFieldFloatValue(1, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set max_speed field
     * Units: m/s
     *
     * @param maxSpeed The new maxSpeed value to be set
     */
    public void setMaxSpeed(Float maxSpeed) {
        setFieldValue(1, 0, maxSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get avg_speed field
     * Units: m/s
     *
     * @return avg_speed
     */
    public Float getAvgSpeed() {
        return getFieldFloatValue(2, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set avg_speed field
     * Units: m/s
     *
     * @param avgSpeed The new avgSpeed value to be set
     */
    public void setAvgSpeed(Float avgSpeed) {
        setFieldValue(2, 0, avgSpeed, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get shot_count field
     *
     * @return shot_count
     */
    public Integer getShotCount() {
        return getFieldIntegerValue(3, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set shot_count field
     *
     * @param shotCount The new shotCount value to be set
     */
    public void setShotCount(Integer shotCount) {
        setFieldValue(3, 0, shotCount, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get projectile_type field
     *
     * @return projectile_type
     */
    public ProjectileType getProjectileType() {
        Short value = getFieldShortValue(4, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
        if (value == null) {
            return null;
        }
        return ProjectileType.getByValue(value);
    }

    /**
     * Set projectile_type field
     *
     * @param projectileType The new projectileType value to be set
     */
    public void setProjectileType(ProjectileType projectileType) {
        setFieldValue(4, 0, projectileType.value, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Get grain_weight field
     * Units: gr
     *
     * @return grain_weight
     */
    public Float getGrainWeight() {
        return getFieldFloatValue(5, 0, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

    /**
     * Set grain_weight field
     * Units: gr
     *
     * @param grainWeight The new grainWeight value to be set
     */
    public void setGrainWeight(Float grainWeight) {
        setFieldValue(5, 0, grainWeight, Fit.SUBFIELD_INDEX_MAIN_FIELD);
    }

}