package polymorphism;

public abstract class Shape {

	protected String name;

	// protected is a better choice so the children classes would be able to access
	// it but not any other classes
	protected Shape(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract double area();

	public abstract void draw();

	public static void main(String[] args) {
		
		Shape arr[] = new Shape [10];	
		arr[0] = new Rectangle(5.3,5.0);
		arr[1] = new Rectangle(1.2,5.0);
		arr[2] = new Rectangle(2.0,5.0);
		arr[3] = new Rectangle(5.5,5.0);
		arr[4] = new Rectangle(2.4,5.0);
		arr[5] = new Circle(1.0);
		arr[6] = new Circle(2.0);
		arr[7] = new Circle(6.0);
		arr[8] = new Circle(4.88);
		arr[9] = new Circle(5.0);
		
		for (Shape s : arr) {
			System.out.println("Area: " + s.area());
			s.draw();
		}

	}
}
