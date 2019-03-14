package Prob2;

public class Circle implements Polygon {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double[] getSide() {

		double[] sides = {2 * Math.PI * radius};
		return sides;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
}
