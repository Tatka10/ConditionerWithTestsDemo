package condi.ConditionerWithTestsDemo;


import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CondService {
    static String[] listCondi = new String[3];

    public static void add() {

        for (int i = 0; i < 3; i++) {
            listCondi[0] = t1;
            listCondi[1] = tNew;
            listCondi[2] = mode;
            ;
        }
        System.out.println(listCondi);
    }

    public static void add(String[] temp) {

        for (int i = 0; i < 3; i++) {
            listCondi[0] = t1;
            listCondi[1] = tNew;
            listCondi[2] = mode;
            ;
        }
        System.out.println(listCondi);
    }
    }

    public String [] getListCondi() {
        return listCondi;

    }
}
