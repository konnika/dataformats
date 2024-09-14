package konrad.dataformats.core.types;

public interface TypeGenerator {
    Type fromCsv(String value);

    boolean acceptsCsv(String value);
}
