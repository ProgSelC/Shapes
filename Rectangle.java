package selcpkg;

public class Rectangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public double calcPerimetr() {
		return a.getDist(b)+b.getDist(c)+c.getDist(d)+d.getDist(a);
	}

	@Override
	public double calcSquare() {
		return a.getDist(b)*b.getDist(c);
	}

}
