package piApprox;

public class Circle {
	private final int radius = 1;
	private int pointTotal = 0;

	public int getRadius() {
		return radius;
	}

	public int getPointTotal() {
		return pointTotal;
	}

	public void addPoint() {
		pointTotal++;
	}
}