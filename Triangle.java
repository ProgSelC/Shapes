package selcpkg;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double calcPerimetr() {
		return a.getDist(b) + b.getDist(c) + c.getDist(a);
	}

	@Override
	public double calcSquare() {
		double p = this.calcPerimetr() / 2;

		return Math.sqrt(p * (p - a.getDist(b))
				* (p - b.getDist(c)) * (p - c.getDist(a)));
	}
}
