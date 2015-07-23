package selcpkg;

public class Main {

	public static void main(String[] args) {
		Circle crk = new Circle(new Point(0, 0), new Point(0, 2));
		Triangle tr = new Triangle(new Point(0, 0), new Point(0, 1), new Point(
				2, 0));
		Rectangle rc = new Rectangle(new Point(0, 0), new Point(0, 1),
				new Point(2, 1), new Point(2, 0));

		Board brd = new Board();
		brd.putShape(crk, 3);
		brd.putShape(rc, 4);
		brd.putShape(tr, 1);
		brd.putShape(crk, 2);

		brd.printInf();
		brd.printTotalSquare();
		
		brd.putShape(tr, 2);
		
		brd.printInf();
		
		brd.delShape(2);
		
		brd.printInf();
		brd.printTotalSquare();
	}

}
