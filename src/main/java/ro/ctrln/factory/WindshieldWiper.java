package ro.ctrln.factory;

public class WindshieldWiper implements Part {

    @Override
    public String getPart() {
        return "Windshield Wiper";
    }

    @Override
    public int getSize() {
        return 60;
    }
}
