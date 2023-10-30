package ro.ctrln.factory;

public class PartFabrication {

    public static void main(String[] args) {

        PartsFactory partsFactory = new PartsFactory();
        Part waterPump = partsFactory.getPart(PartType.waterpump);

        System.out.println(waterPump.getPart());
        System.out.println(waterPump.getSize());

        Part windshield = partsFactory.getPart(PartType.windshield);
        System.out.println(windshield.getPart());
        System.out.println(windshield.getSize());

        Part windshieldWiper = partsFactory.getPart(PartType.windshieldwiper);
        System.out.println(windshieldWiper.getPart());
        System.out.println(windshieldWiper.getSize());

        Part wheel = partsFactory.getPart(PartType.wheel);
        System.out.println(wheel.getPart());
        System.out.println(wheel.getSize());
    }
}
