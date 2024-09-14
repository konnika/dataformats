package konrad.dataformats.core.types;

public interface IType {
    boolean hasId(Class<?> aClass);

    boolean hasId(String string);

    boolean hasClass(Class<?> aClass);

    boolean accepts(Object object);
}
