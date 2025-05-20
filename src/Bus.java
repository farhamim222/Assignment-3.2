public class Bus extends AbstractVehicle {
    private int capacity;

    public Bus() {
        super("Bus", "Diesel", "Yellow");
        this.capacity = 40;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCapacity: " + capacity + " passengers";
    }
}
