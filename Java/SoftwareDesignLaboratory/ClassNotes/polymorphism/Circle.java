package polymorphism;

class Circle extends Shape {

	public double r;

	public Circle(double r) {
		super("circle");
		this.r = r;
	}

	public double area() {
		return Math.PI*Math.pow(r, 2);
	}

	public void draw() {
		System.out.println("Draw ccircle here");
	}
}
