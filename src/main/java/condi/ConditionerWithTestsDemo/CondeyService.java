package condi.ConditionerWithTestsDemo;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.stream;

@Component
public class CondService {
    static Map<String, Temperature> list = new LinkedHashMap<>();

    public static void saveAllValues(Temperature t, String mode) {
        list.put(mode, t);
    }
    public void save(){
String fname="temp_mode_data.txt";
List<String> lines=list.entrySet().stream().map(y->y.setValue()+";"+y.getT()+)
    }
}



public String[] getListCondi() {
    return listCondi;

}

