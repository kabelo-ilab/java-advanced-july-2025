package Chapter7.Inheritance;

public class MyRectangle extends Shape {

    public MyRectangle(int l, int w){
        super(l,w);
    }

    public double calcPerimeter(){
        return 2 * (this.getLength() + this.getWidth());
    }
}
