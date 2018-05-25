package P9_MyCircle_MyPoint;

/**
 * 
 * @author Ramon Figueiredo Pessoa
 *
 */

public class MyPoint {

	private int x;
	private int y;

	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] v = { x, y };
		return v;

	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	public double distance(int x, int y) {
		return euclideanDistance(this, new MyPoint(x, y));
	}

	public double distance(MyPoint another) {
		return euclideanDistance(this, another);
	}

	public double distance() {
		return euclideanDistance(new MyPoint(0, 0), this);
	}

	private double euclideanDistance(MyPoint p1, MyPoint p2) {
		int resultX = Math.abs(p1.getX() - p2.getX());
		int resultY = Math.abs(p1.getY() - p2.getY());
		double distance = Math.sqrt(Math.pow(resultX, 2) + Math.pow(resultY, 2));

		return distance;
	}
}
