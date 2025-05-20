public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Red");
        Motorcycle bike = new Motorcycle("Black");
        Bus bus = new Bus("Yellow");
        ElectricCar eCar = new ElectricCar("Blue");
        ElectricMotorcycle eBike = new ElectricMotorcycle("Green");

        System.out.println("Vehicle Demonstration\n");

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency());
        System.out.println();

        bike.start();
        bike.stop();
        System.out.println(bike.getInfo());
        System.out.println("Fuel Efficiency: " + bike.calculateFuelEfficiency());
        System.out.println();

        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
        System.out.println("Fuel Efficiency: " + bus.calculateFuelEfficiency());
        System.out.println();

        eCar.start();
        eCar.charge();
        System.out.println(eCar.getInfo());
        System.out.println("Efficiency: " + eCar.calculateFuelEfficiency() + " kWh/100km");
        System.out.println();

        eBike.start();
        eBike.charge();
        System.out.println(eBike.getInfo());
        System.out.println("Efficiency: " + eBike.calculateFuelEfficiency() + " kWh/100km");
    }
}

