package Chapter7.Interfaces;
/*Interfaces are abstract classes that allow
* multiple inheritance*/
public class MyRectangle implements IShape, IGraphics {

    /**
     * @return
     */
    @Override
    public double getArea() {
        return 0;
    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 0;
    }

    /**
     *
     */
    @Override
    public void draw() {

    }

    /**
     * @param color
     */
    @Override
    public void applyColor(String color) {

    }
}
