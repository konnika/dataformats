package konrad.dataformats.core.types;

public interface TypeGenerator {
    IType fromCsv(String value);

    boolean acceptsCsv(String value);
}
