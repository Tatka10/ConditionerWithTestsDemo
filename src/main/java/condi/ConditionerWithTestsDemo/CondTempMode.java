package condi.ConditionerWithTestsDemo;

public class CondTempMode {
    Temperature temp;
    String mode;

    @Override
    public String toString() {
        return "CondTempMode{" +
                "temp=" + temp +
                ", mode='" + mode + '\'' +
                '}';
    }

    public Temperature getTemp() {
        return temp;
    }

    public String getMode() {
        return mode;
    }

    public CondTempMode(Temperature temp, String mode) {
        this.temp = temp;
        this.mode = mode;
    }
}
