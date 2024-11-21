package condi.ConditionerWithTestsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Temperature {
    String t;
    String tNew;

    public String getT() {
        return t;
    }

    public String gettNew() {
        return tNew;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "t=" + t +
                ", tNew=" + tNew +
                '}';
    }

    public void setT(String t) {
        this.t = t;
    }

    public void settNew(String tNew) {
        this.tNew = tNew;
    }

    public Temperature(String t, String tNew) {
        this.t = t;
        this.tNew = tNew;
    }
    public Map<String, String> save(String t, String tnew){
        Map<String, String> list=new HashMap<>();
        list.put(t, tNew);
        return list;
    }
}
