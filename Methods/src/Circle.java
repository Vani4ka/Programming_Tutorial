
public class Circle {

	private double radius;

	public Circle() {
		radius = 1;
	}

	public Circle(double r) {
		radius = r;
	}

	public double diameter() {
		return radius*2;
	}

	public double circumference() {
		return 2*Math.PI*radius;
	}

	public double area() {
		return Math.PI*radius*radius;
	}

    public static void main(String[] args) {
    	Circle c = new Circle();
    	System.out.println("The diameter of circle c is " + c.diameter());
    	System.out.println("The circumference of circle c is " + c.circumference());
    	System.out.println("The area of circle c is " + c.area());

    	Circle c1 = new Circle(7);
    	System.out.println("The diameter of circle c1 is " + c1.diameter());
    	System.out.println("The circumference of circle c1 is " + c1.circumference());
    	System.out.println("The area of circle c1 is " + c1.area());
    }
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
}
