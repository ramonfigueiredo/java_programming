package P13_Shape_Circle_Rectangle_Square;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class Rectangle extends Shape {

	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}

	public double getPerimeter() {
		return (width * 2) + (length * 2);
	}

	@Override
	public String toString() {
		return "Rectangle[" + super.toString() + ", width=" + getWidth() + ", length=" + getLength() + "]";
	}
}
