package polymorphism;

class Rectangle extends Shape {

	public double w, h;

	public Rectangle(double w, double h) {
		super("rectangle");
		this.w = w;
		this.h = h;
	}

	public double area() {
		return w * h;
	}

	public void draw() {
		System.out.println("Draw rectangle here");
	}
}