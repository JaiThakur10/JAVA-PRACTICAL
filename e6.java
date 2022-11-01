interface Shape {
	double perimeter();
}

class Rectangle implements Shape {

	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double perimeter() {

		return 2 * (length + breadth);
	}
}

class Circle implements Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double perimeter() {

		return 2 * Math.PI * radius;
	}
}

public class e6 {

	public static void main(String[] args) {
		// Rectangle area and parameter
		double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - perimeter: " + r.perimeter());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - perimeter: " + c.perimeter());

	}
}
