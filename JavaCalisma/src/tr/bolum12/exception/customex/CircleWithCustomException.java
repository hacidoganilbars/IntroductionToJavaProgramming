package tr.bolum12.exception.customex;

public class CircleWithCustomException {
	private double radius;
	private static int numberOfObjects = 0;

	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}

	public CircleWithCustomException(double radius) throws InvalidRadiusException {
		setRadius(radius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws InvalidRadiusException {
		if (radius >= 0) {
			this.radius = radius;
		} else {
			throw new InvalidRadiusException(radius);
		}
	}

	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	public double findArea() {
		return Math.PI * radius * radius;
	}

}
