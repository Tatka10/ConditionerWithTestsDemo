package condi.ConditionerWithTestsDemo;

import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.stream;

@Component
public class CondService {
    static Map<String, Temperature> list = new LinkedHashMap<>();

    public static Map<String, Temperature> add(String mode, Temperature t) {
        list.put(mode, t);
        return list;
    }

    public void save() {
        String fname = "temp_mode_data.txt";

    }
}






