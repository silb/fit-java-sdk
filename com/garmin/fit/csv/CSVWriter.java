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


package com.garmin.fit.csv;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;

import com.garmin.fit.*;

public class CSVWriter {
    private final OutputStream outputStream;
    private ByteArrayOutputStream intermediateOutputStream;
    private BufferedWriter intermediateWriter;
    private final ArrayList<String> headers = new ArrayList<>();
    private final ArrayList<String> values = new ArrayList<>();
    private int maxNumberValues = 0;

    public CSVWriter(ByteArrayOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public void close() {
        try {
            if (intermediateWriter != null) {
                intermediateWriter.close();
                intermediateWriter = null;

                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));

                for (String header : headers) {
                    writer.write(header + ",");
                }
                writer.write("\n");

                // Read through intermediate contents and write to the output stream
                BufferedReader reader;
                byte[] intermediateContents = intermediateOutputStream.toByteArray();
                reader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(intermediateContents), StandardCharsets.UTF_8));

                while (reader.ready()) {
                    writer.write(reader.readLine() + "\n");
                }

                reader.close();
                writer.close();
            }
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void clear() {
        Collections.fill(values, "");
    }

    public void set(String header, Object value) {
        if (header == null) {
            header = "null";
        }

        if (value == null) {
            value = "null";
        }

        for (int i = 0; i < headers.size(); i++) {
            if (headers.get(i).compareTo(header) == 0) {
                values.set(i, value.toString());
                return;
            }
        }

        headers.add(header);
        values.add(value.toString());
    }

    public void writeln() {
        try {
            if (intermediateWriter == null) {
                intermediateOutputStream = new ByteArrayOutputStream();
                intermediateWriter = new BufferedWriter(new OutputStreamWriter(intermediateOutputStream, StandardCharsets.UTF_8));
            }

            for (String value : values) {
                intermediateWriter.write(value + ",");
            }

            if (values.size() < maxNumberValues) {
                for (int i = 0; i < maxNumberValues - values.size(); i++) {
                    intermediateWriter.write(",");
                }
            }

            intermediateWriter.write("\n");
        } catch (java.io.IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMaxNumberValues(int numberValues) {
        maxNumberValues = numberValues;
    }
}
