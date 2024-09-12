package konrad.dataformats.core;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class TestObjectMapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T toObject(Map<String, Object> map, Class<T> aClass) {
        return objectMapper.convertValue(map, aClass);
    }

    public static Map<String, Object> toMap(Object object) {
        return objectMapper.convertValue(object, new TypeReference<>() {
        });
    }
}
