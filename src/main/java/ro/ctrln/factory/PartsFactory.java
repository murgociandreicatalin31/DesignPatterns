package ro.ctrln.factory;

public class PartsFactory {

    public Part getPart(PartType partType) {
        switch (partType) {
            case windshieldwiper:
                return new WindshieldWiper();
            case waterpump:
                return new WaterPump();
            case windshield:
                return new Windshield();
            case wheel:
                return new Wheel();

        }
        return null;
    }
}
