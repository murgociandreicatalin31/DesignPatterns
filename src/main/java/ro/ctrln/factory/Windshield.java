package ro.ctrln.factory;

public class Windshield implements Part {


    @Override
    public String getPart() {
        return "Windshield";
    }

    @Override
    public int getSize() {
        return 100;
    }
}
