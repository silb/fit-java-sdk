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

import java.util.ArrayList;

public class BufferedRecordMesgBroadcaster implements RecordMesgListener{
    private BufferedRecordMesg bufferedRecordMesg;
    private ArrayList<BufferedRecordMesgListener> listeners;

    public BufferedRecordMesgBroadcaster() {
        bufferedRecordMesg = new BufferedRecordMesg();
        listeners = new ArrayList<BufferedRecordMesgListener>();
    }

    public void addListener(BufferedRecordMesgListener mesgListener) {
        listeners.add(mesgListener);
    }

    public void removeListener(BufferedRecordMesgListener mesgListener) {
        listeners.remove(mesgListener);
    }

    public void onMesg(final RecordMesg mesg) {
        bufferedRecordMesg.setFields(mesg);

        for (final BufferedRecordMesgListener listener : listeners) {
            listener.onMesg(bufferedRecordMesg);
        }
    }
}
