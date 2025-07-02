package Chapter7.Inheritance;
/*private - attributes are only accessible inside their own class
* public - attributes are accessible outside the class, anywhere in
*           the application
* protected - attributes are available / accessible to those that inherit
* from the parent class*/
public class Shape {
    protected int length, width;

    /**
     * Construct the shape object
     * @param length Length of the Shape
     * @param width Width of the Shape
     */
    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    /**
     * Calculate and return the area of the Shape
     * @return
     */
    public double calcArea(){
        return this.length * this.width;
    }

    public void display(String title){
        System.out.println("============ " + title + " ===================");
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Area: " + calcArea());
        System.out.println();
    }
}
