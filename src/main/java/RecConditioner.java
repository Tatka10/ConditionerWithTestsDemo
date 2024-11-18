import condi.ConditionerWithTestsDemo.Conditioner;
import org.springframework.stereotype.Component;
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
    public String calcTemp(String t1, String t2, String mode, Model m) {
        int t = Integer.parseInt(t1);
        int tNew = Integer.parseInt(t2);
        String mode;
        m.addAllAttributes("result", Conditioner.getResultTemp(int t, int tNew, String mode);
    }
}
