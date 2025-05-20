public class ElectricMotorcycle extends AbstractVehicle {

    public ElectricMotorcycle(String color) {
        super("Electric Motorcycle", "Electric", color);
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging...");
    }
}
