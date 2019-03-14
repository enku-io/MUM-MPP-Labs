package Prob2;

public class EquilateralTriangle implements Polygon {
    private double side;


    public EquilateralTriangle(double side) {
        this.side = side;
    }

    @Override
    public double[] getSide() {
        double[] sides = {side,side,side};
        return sides;
    }

    //@Override
    //public double computePerimeter() {
      //  return side * 3;
    //}
}
