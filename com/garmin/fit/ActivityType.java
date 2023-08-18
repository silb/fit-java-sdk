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


public enum ActivityType  {
    GENERIC((short)0),
    RUNNING((short)1),
    CYCLING((short)2),
    TRANSITION((short)3),
    FITNESS_EQUIPMENT((short)4),
    SWIMMING((short)5),
    WALKING((short)6),
    SEDENTARY((short)8),
    ALL((short)254),
    INVALID((short)255);

    protected short value;

    private ActivityType(short value) {
        this.value = value;
    }

    public static ActivityType getByValue(final Short value) {
        for (final ActivityType type : ActivityType.values()) {
            if (value == type.value)
                return type;
        }

        return ActivityType.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum constant
     */
    public static String getStringFromValue( ActivityType value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}