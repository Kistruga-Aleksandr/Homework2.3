public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car1",4);
        Car car2 = new Car("Car2",4);


        Truck truck = new Truck("Truc1",6);
        Truck truck2 = new Truck("Truc2",8);


        Bicycle bicycle = new Bicycle("Bicycle1",2);
        Bicycle bicycle2 = new Bicycle("Bicycle2",2);


        car.check(car, null, null);
        System.out.println();
        car.check(car2, null, null);
        System.out.println();
        bicycle.check(null, bicycle, null);
        System.out.println();
        bicycle.check(null, bicycle2, null);
        System.out.println();
        truck.check(null, null, truck);
        System.out.println();
        truck.check(null, null, truck2);


    }
}
