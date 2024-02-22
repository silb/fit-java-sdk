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


public enum SportEvent  {
    UNCATEGORIZED((short)0),
    GEOCACHING((short)1),
    FITNESS((short)2),
    RECREATION((short)3),
    RACE((short)4),
    SPECIAL_EVENT((short)5),
    TRAINING((short)6),
    TRANSPORTATION((short)7),
    TOURING((short)8),
    INVALID((short)255);

    protected short value;

    private SportEvent(short value) {
        this.value = value;
    }

    public static SportEvent getByValue(final Short value) {
        for (final SportEvent type : SportEvent.values()) {
            if (value == type.value)
                return type;
        }

        return SportEvent.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum constant
     */
    public static String getStringFromValue( SportEvent value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}