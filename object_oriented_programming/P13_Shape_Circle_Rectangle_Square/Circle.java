package P13_Shape_Circle_Rectangle_Square;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Circle extends Shape {

	protected double radius;

	public Circle()
	{
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle[" + super.toString() + ", radius=" + getRadius() + "]";
	}
}
