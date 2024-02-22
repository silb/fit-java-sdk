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


public enum SensorType  {
    ACCELEROMETER((short)0),
    GYROSCOPE((short)1),
    COMPASS((short)2),
    BAROMETER((short)3),
    INVALID((short)255);

    protected short value;

    private SensorType(short value) {
        this.value = value;
    }

    public static SensorType getByValue(final Short value) {
        for (final SensorType type : SensorType.values()) {
            if (value == type.value)
                return type;
        }

        return SensorType.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum constant
     */
    public static String getStringFromValue( SensorType value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}