package selcpkg;

public class Point {
	double x;
	double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDist(Point b) {
		return Math.sqrt((this.x - b.getX()) * (this.x - b.getX())
				+ (this.y - b.getY()) * (this.y - b.getY()));
	}
}
