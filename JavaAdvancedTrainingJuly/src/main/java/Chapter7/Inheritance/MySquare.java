package Chapter7.Inheritance;

public class MySquare extends Shape  {

    public MySquare(int s){//5
        super(s,s);
    }

    public void display(String title){
        System.out.println("============ " + title + " ===================");
        System.out.println("Side: " + getLength());
        System.out.println("Area: " + calcArea());
        System.out.println();
    }


}
