package ro.ctrln.factory;

public class Wheel implements Part {


    @Override
    public String getPart() {
        return "Wheel";
    }

    @Override
    public int getSize() {
        return 16;
    }
}
