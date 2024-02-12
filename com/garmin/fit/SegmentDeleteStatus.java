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


public enum SegmentDeleteStatus  {
    DO_NOT_DELETE((short)0),
    DELETE_ONE((short)1),
    DELETE_ALL((short)2),
    INVALID((short)255);

    protected short value;

    private SegmentDeleteStatus(short value) {
        this.value = value;
    }

    public static SegmentDeleteStatus getByValue(final Short value) {
        for (final SegmentDeleteStatus type : SegmentDeleteStatus.values()) {
            if (value == type.value)
                return type;
        }

        return SegmentDeleteStatus.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum constant
     */
    public static String getStringFromValue( SegmentDeleteStatus value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
