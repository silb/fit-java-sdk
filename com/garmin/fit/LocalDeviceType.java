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

import java.util.HashMap;
import java.util.Map;

public class LocalDeviceType  {
    public static final short GPS = 0; // Onboard gps receiver
    public static final short GLONASS = 1; // Onboard glonass receiver
    public static final short GPS_GLONASS = 2; // Onboard gps glonass receiver
    public static final short ACCELEROMETER = 3; // Onboard sensor
    public static final short BAROMETER = 4; // Onboard sensor
    public static final short TEMPERATURE = 5; // Onboard sensor
    public static final short WHR = 10; // Onboard wrist HR sensor
    public static final short SENSOR_HUB = 12; // Onboard software package
    public static final short INVALID = Fit.UINT8_INVALID;

    private static final Map<Short, String> stringMap;

    static {
        stringMap = new HashMap<Short, String>();
        stringMap.put(GPS, "GPS");
        stringMap.put(GLONASS, "GLONASS");
        stringMap.put(GPS_GLONASS, "GPS_GLONASS");
        stringMap.put(ACCELEROMETER, "ACCELEROMETER");
        stringMap.put(BAROMETER, "BAROMETER");
        stringMap.put(TEMPERATURE, "TEMPERATURE");
        stringMap.put(WHR, "WHR");
        stringMap.put(SENSOR_HUB, "SENSOR_HUB");
    }


    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum contsant
     */
    public static String getStringFromValue( Short value ) {
        if( stringMap.containsKey( value ) ) {
            return stringMap.get( value );
        }

        return "";
    }

    /**
     * Returns the enum constant with the specified name.
     * @param value The enum string value
     * @return The enum constant or INVALID if unknown
     */
    public static Short getValueFromString( String value ) {
        for( Map.Entry<Short, String> entry : stringMap.entrySet() ) {
            if( entry.getValue().equals( value ) ) {
                return entry.getKey();
            }
        }

        return INVALID;
    }

}
