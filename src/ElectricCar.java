public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String color) {
        super("Electric Car", "Electric", color);
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging...");
    }
}
