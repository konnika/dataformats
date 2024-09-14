package konrad.dataformats.core.types;

public interface Type {
    boolean hasId(Class<?> aClass);

    boolean hasId(String string);

    boolean hasClass(Class<?> aClass);

    boolean accepts(Object object);
}
