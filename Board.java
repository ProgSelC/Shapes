package selcpkg;

public class Board {
	private Shape[] sectors = new Shape[4];

	public Board() {
		super();
	}

	public void putShape(Shape a, int i) {
		if (this.sectors[i - 1] == null) {
			this.sectors[i - 1] = a;
			System.out.printf("Sector %d filled with %s\n", i, a.getClass()
					.getName().split("[.]")[1]);
		} else {
			System.out.printf("Sorry, sector %s is occupied!\n", i);
		}
	}

	public void delShape(int i) {
		if (this.sectors[i - 1] == null) {
			System.out.println("Sector " + i
					+ " is empty, no action required!");
		} else {
			this.sectors[i-1] = null;
			System.out.println("Sector " + i + " cleared!");
		}
	}

	public void printInf() {
		int i = 1;
		
		System.out.println();
		
		for (Shape a : sectors) {
			if (a == null) {
				System.out.printf("Sector %d:\tFREE\n", i);
			} else {
				System.out.printf("Sector %d:\t%s\tSquare:\t%.2f\n", i, a
						.getClass().getName().split("[.]")[1], a.calcSquare());
			}
			i++;
		}
	}

	public void printTotalSquare() {
		double totalSq = 0;
		for (Shape a : sectors) {
			totalSq += a == null ? 0 : a.calcSquare();
		}
		System.out.printf("\nTotal Square:\t\t\t%.2f\n\n", totalSq);
	}
}
