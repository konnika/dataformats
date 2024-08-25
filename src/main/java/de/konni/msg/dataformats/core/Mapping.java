package de.konni.msg.dataformats.core;

public interface Mapping {
    void applyTo(Data in, Data out);
    boolean matches(DataFormatId in, DataFormatId out);
}
