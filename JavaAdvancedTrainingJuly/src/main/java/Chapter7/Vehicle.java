package Chapter7;

public class Vehicle {
    //Instance variables
    String name;
    String model;
    String color;
    int numOfWheels;
    int numOfDoors;

    //default constructor
    public Vehicle(){
        this.color = "White";//default color for all vehicles is white
    }
    //overloaded constructor
    public Vehicle(String name, String model, String color, int wheels, int doors){
        this.color = color;
        this.model = model;
        this.name = name;
        this.numOfDoors = doors;
        this.numOfWheels = wheels;
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Wheels: " + this.numOfWheels);
        System.out.println("Doors: " + this.numOfDoors);
    }
}
