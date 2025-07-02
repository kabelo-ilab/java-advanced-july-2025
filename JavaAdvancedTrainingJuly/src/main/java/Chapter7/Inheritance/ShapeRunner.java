package Chapter7.Inheritance;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape objShape = new Shape(5,8);
        objShape.display("Shape");

        MyRectangle objRec = new MyRectangle(4,6);
        objRec.display("Rectangle");
        System.out.println("Perimeter: " + objRec.calcPerimeter());

        MySquare objSq = new MySquare(5);
        objSq.display("Square");

        MyCircle objCircle = new MyCircle(6);
        objCircle.display("Circle");

        MyTriangle objTriangle = new MyTriangle(7,5);
        objTriangle.display("Triangle");

    }
}
