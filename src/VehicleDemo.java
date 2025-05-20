public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar eCar = new ElectricCar("Blue");
        eCar.start();
        eCar.charge();
        System.out.println(eCar.getInfo());

        System.out.println();

        ElectricMotorcycle eBike = new ElectricMotorcycle("Green");
        eBike.start();
        eBike.charge();
        System.out.println(eBike.getInfo());
    }
}
