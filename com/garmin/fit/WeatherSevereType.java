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


public enum WeatherSevereType  {
    UNSPECIFIED((short)0),
    TORNADO((short)1),
    TSUNAMI((short)2),
    HURRICANE((short)3),
    EXTREME_WIND((short)4),
    TYPHOON((short)5),
    INLAND_HURRICANE((short)6),
    HURRICANE_FORCE_WIND((short)7),
    WATERSPOUT((short)8),
    SEVERE_THUNDERSTORM((short)9),
    WRECKHOUSE_WINDS((short)10),
    LES_SUETES_WIND((short)11),
    AVALANCHE((short)12),
    FLASH_FLOOD((short)13),
    TROPICAL_STORM((short)14),
    INLAND_TROPICAL_STORM((short)15),
    BLIZZARD((short)16),
    ICE_STORM((short)17),
    FREEZING_RAIN((short)18),
    DEBRIS_FLOW((short)19),
    FLASH_FREEZE((short)20),
    DUST_STORM((short)21),
    HIGH_WIND((short)22),
    WINTER_STORM((short)23),
    HEAVY_FREEZING_SPRAY((short)24),
    EXTREME_COLD((short)25),
    WIND_CHILL((short)26),
    COLD_WAVE((short)27),
    HEAVY_SNOW_ALERT((short)28),
    LAKE_EFFECT_BLOWING_SNOW((short)29),
    SNOW_SQUALL((short)30),
    LAKE_EFFECT_SNOW((short)31),
    WINTER_WEATHER((short)32),
    SLEET((short)33),
    SNOWFALL((short)34),
    SNOW_AND_BLOWING_SNOW((short)35),
    BLOWING_SNOW((short)36),
    SNOW_ALERT((short)37),
    ARCTIC_OUTFLOW((short)38),
    FREEZING_DRIZZLE((short)39),
    STORM((short)40),
    STORM_SURGE((short)41),
    RAINFALL((short)42),
    AREAL_FLOOD((short)43),
    COASTAL_FLOOD((short)44),
    LAKESHORE_FLOOD((short)45),
    EXCESSIVE_HEAT((short)46),
    HEAT((short)47),
    WEATHER((short)48),
    HIGH_HEAT_AND_HUMIDITY((short)49),
    HUMIDEX_AND_HEALTH((short)50),
    HUMIDEX((short)51),
    GALE((short)52),
    FREEZING_SPRAY((short)53),
    SPECIAL_MARINE((short)54),
    SQUALL((short)55),
    STRONG_WIND((short)56),
    LAKE_WIND((short)57),
    MARINE_WEATHER((short)58),
    WIND((short)59),
    SMALL_CRAFT_HAZARDOUS_SEAS((short)60),
    HAZARDOUS_SEAS((short)61),
    SMALL_CRAFT((short)62),
    SMALL_CRAFT_WINDS((short)63),
    SMALL_CRAFT_ROUGH_BAR((short)64),
    HIGH_WATER_LEVEL((short)65),
    ASHFALL((short)66),
    FREEZING_FOG((short)67),
    DENSE_FOG((short)68),
    DENSE_SMOKE((short)69),
    BLOWING_DUST((short)70),
    HARD_FREEZE((short)71),
    FREEZE((short)72),
    FROST((short)73),
    FIRE_WEATHER((short)74),
    FLOOD((short)75),
    RIP_TIDE((short)76),
    HIGH_SURF((short)77),
    SMOG((short)78),
    AIR_QUALITY((short)79),
    BRISK_WIND((short)80),
    AIR_STAGNATION((short)81),
    LOW_WATER((short)82),
    HYDROLOGICAL((short)83),
    SPECIAL_WEATHER((short)84),
    INVALID((short)255);

    protected short value;

    private WeatherSevereType(short value) {
        this.value = value;
    }

    public static WeatherSevereType getByValue(final Short value) {
        for (final WeatherSevereType type : WeatherSevereType.values()) {
            if (value == type.value)
                return type;
        }

        return WeatherSevereType.INVALID;
    }

    /**
     * Retrieves the String Representation of the Value
     * @param value The enum constant
     * @return The name of this enum constant
     */
    public static String getStringFromValue( WeatherSevereType value ) {
        return value.name();
    }

    public short getValue() {
        return value;
    }


}
