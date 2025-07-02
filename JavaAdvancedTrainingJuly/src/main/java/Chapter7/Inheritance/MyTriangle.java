package Chapter7.Inheritance;

public class MyTriangle extends Shape {

    public MyTriangle(int base, int height){
        //   length, width
        super(base, height);
    }

    public double calcArea(){
        //area = (h * b) / 2
        return (this.length * this.width) / 2;
    }
    public void display(String title){
        System.out.println("============ " + title + " ===================");
        System.out.println("Base: " + this.length);
        System.out.println("Height: " + this.width);
        System.out.println("Area: " + calcArea());
        System.out.println();
    }
}
