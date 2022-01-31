package one.digitalinnovation.beerstock.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.digitalinnovation.beerstock.dto.BeerDTO;

public class JsonParserUtils {

    public static String asJsonString(BeerDTO beerDTO) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(beerDTO);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
