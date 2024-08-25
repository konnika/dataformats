package de.konni.msg.dataformats.core;

import java.util.ArrayList;
import java.util.List;

public class Conversion {
    private final DataFormatId from;
    private final DataFormatId to;
    private final List<Mapping> mappings = new ArrayList<>();

    public Conversion(final DataFormatId from, final DataFormatId to, final List<Mapping> mappings) {
        this.from = from;
        this.to = to;
        if (mappings != null) {
            this.mappings.addAll(mappings);
        }
    }

}
