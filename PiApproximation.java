package piApprox;

public class PiApproximation {
	public static void main(String[] args) {
		Square square = new Square();
		Circle circle = new Circle();
		Point[] points = new Point[2100000];

		for (int i = 0; i < points.length; i++) {
			points[i] = new Point();
		}

		for (int i = 0; i < points.length; i++) {
			if (squared(points[i].getX() - 1) + squared(points[i].getY() - 1) <= squared(circle.getRadius()))
				circle.addPoint();
			square.addPoint();
			System.out.println((double) 4 * ((double) circle.getPointTotal() / (double) square.getPointTotal()));
		}
	}

	public static double squared(double s) {
		return s * s;
	}
}
