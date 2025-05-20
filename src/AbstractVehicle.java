public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected double efficiency;

    public AbstractVehicle(String type, String fuel, String color, double efficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.efficiency = efficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel: " + fuel + "\nColor: " + color;
    }

    @Override
    public double calculateFuelEfficiency() {
        return efficiency;
    }
}
