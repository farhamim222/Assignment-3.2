public class ElectricMotorcycle extends AbstractVehicle implements ElectricVehicle {
    public ElectricMotorcycle(String color) {
        // Electric bike, say 2.1 kWh/100km
        super("Electric Motorcycle", "Electric", color, 2.1);
    }

    @Override
    public void charge() {
        System.out.println("Electric Motorcycle is charging...");
    }
}
