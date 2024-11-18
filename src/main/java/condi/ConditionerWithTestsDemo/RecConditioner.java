package condi.ConditionerWithTestsDemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.Integer.parseInt;

@Controller
public class RecConditioner {
    @GetMapping("/")
    public String index() {
        return "conditioner";
    }

    @GetMapping("/calc")
    public String resultOfTemp(String t1, String t2, String mode, Model m)throws Exception{
        try {
            int t = parseInt(t1);
            int tNew = parseInt(t2);



                    m.addAllAttributes("tempResult",  int t, int tNew

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }



    }

    }
}
