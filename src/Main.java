public class Main {
    public static void main(String[] args) {


        Car car = new Car("Car1", 4);
        Car car2 = new Car("Car2", 4);


        Truck truck = new Truck("Truc1", 6);
        Truck truck2 = new Truck("Truc2", 8);


        Bicycle bicycle = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);


        car.check();
        System.out.println();
        car2.check();
        System.out.println();
        bicycle.check();
        System.out.println();
        bicycle2.check();
        System.out.println();
        truck.check();
        System.out.println();
        truck2.check();


    }
}
