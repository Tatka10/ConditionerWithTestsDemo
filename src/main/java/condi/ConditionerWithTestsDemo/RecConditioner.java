package condi.ConditionerWithTestsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static java.lang.Integer.parseInt;

@Controller
public class RecConditioner {

    @Autowired
    CondService condService;

    @GetMapping("/")
    public String index() {
        return "conditioner";
    }

    @GetMapping("/calc")
    public String resultOfTemp(String t1, String t2, String mode, Model m) throws Exception {

        try {
            int t = parseInt(t1);
            int tNew = parseInt(t2);
            m.addAttribute("tempResult", Conditioner.getResultTemp(t, tNew, mode));
            String [] temp = new String[]{t1, t2, mode};
            CondService.add(temp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            m.addAttribute("mistake", e.getMessage());
        }

        return "conditioner";
    }

    @GetMapping("/history")
    public String historyOfTemp(Model m) {
        m.addAttribute("historyCond", condService.getListCondi().toString());
        return "conditioner";

    }

}
