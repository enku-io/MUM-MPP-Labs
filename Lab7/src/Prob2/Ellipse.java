package Prob2;

public class Ellipse implements Polygon {

    private double E,a;

    public Ellipse(double e, double a) {
        E = e;
        this.a = a;
    }

    @Override
    public double[] getSide(){
        double[] sides = {4 * a * E};
        return sides;
    }

    @Override
    public double computePerimeter() {
        return 4 * a * E;
    }
}
