package Prob2;

public interface Polygon {

    double[] getSide();

    default double computePerimeter(){
        double perimeter = 0;
        for(double side : getSide()){
            perimeter= perimeter + side;
        }

        return perimeter;
    }
}
