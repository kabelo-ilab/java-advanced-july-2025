package Chapter7.Inheritance;

public class MyCircle extends Shape {

    public MyCircle(int radius){
        super(0, radius);
    }

    public double calcArea(){
        //              radius      *   radius
        return Math.PI * (getWidth() * getWidth());
    }
    public void display(String title){
        System.out.println("============ " + title + " ===================");
        System.out.println("Radius: " + getWidth());
        System.out.println("Area: " + calcArea());
        System.out.println();
    }
}
