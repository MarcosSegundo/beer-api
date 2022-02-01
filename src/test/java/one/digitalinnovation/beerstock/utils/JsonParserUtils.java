package one.digitalinnovation.beerstock.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParserUtils {

    public static <T> String asJsonString(T dto) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(dto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
