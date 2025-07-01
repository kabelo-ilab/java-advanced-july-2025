package Chapter7;

public class VehicleRunner {
    public static void main(String[] args) {
        /*create a Vehicle object
        Car object created using overloaded constructor
         */
        Vehicle objCar = new Vehicle("Polo","TSI", "White", 4, 5);
        System.out.println("===============Car Information================");
        objCar.display();

        //Truck object created using overloaded constructor
        Vehicle objTruck = new Vehicle("ISUZU","N-Series", "Red", 6, 3);
        System.out.println("\n===============Truck Information================");
        objTruck.display();

        //Bicycle object created using default constructor
        Vehicle objCycle = new Vehicle();
        objCycle.color = "Blue";
        objCycle.model = "Mountain Bike";
        objCycle.name = "BMX";
        objCycle.numOfDoors = 0;
        objCycle.numOfWheels = 2;

        System.out.println("\n===============Bicycle Information================");
        objCycle.display();

    }
}
