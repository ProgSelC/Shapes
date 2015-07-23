package selcpkg;

public class Circle extends Shape {
	private Point center;
	private Point radius;

	public Circle(Point center, Point radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getRadius() {
		return radius;
	}

	public void setRadius(Point radius) {
		this.radius = radius;
	}

	@Override
	public double calcPerimetr() {
		return 2*Math.PI*center.getDist(radius);
	}

	@Override
	public double calcSquare() {
		return Math.PI*center.getDist(radius)*center.getDist(radius);
	}

}
