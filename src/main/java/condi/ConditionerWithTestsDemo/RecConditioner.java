package condi.ConditionerWithTestsDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecConditioner {
    @GetMapping("/")
    public String index() {
        return "conditioner";
    }

    @GetMapping("/calc")
    public String resultOfTemp(String t, String tNew, String mode, Model m)throws Exception{
        try {
            int t1 = Integer.parseInt(t);
            int t2 = Integer.parseInt(tNew);

                    m.addAllAttributes("tempResult", Integer.parseInt(t),Integer.parseInt(tNew),String mode);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }



    }

    }
}
