public class ElectricCar extends AbstractVehicle implements ElectricVehicle {
    public ElectricCar(String color) {
        // Electric car, say 5.2 kWh/100km
        super("Electric Car", "Electric", color, 5.2);
    }

    @Override
    public void charge() {
        System.out.println("Electric Car is charging...");
    }
}
