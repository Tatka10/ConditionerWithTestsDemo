package condi.ConditionerWithTestsDemo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
public class CondService {
    ArrayList<Conditioner> listCondi = new ArrayList<>();

    public void add(Conditioner c) {
        listCondi.add(c);
    }

    public ArrayList<Conditioner> getListCondi() {
        return listCondi;

    }
}
