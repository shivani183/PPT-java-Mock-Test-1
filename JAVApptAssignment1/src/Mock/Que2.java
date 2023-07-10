
/*Create a superclass called Shape with an abstract method calculateArea() that returns the area of the 
shape. Implement subclasses Rectangle, Circle, and Triangle that inherit from the Shape class. Implement 
the calculateArea() method in each subclass to calculate and return the area of a rectangle, circle, and 
triangle, respectively. Then, create a class called ShapeCalculator with a method printArea (Shape shape) 
that accepts an object of type Shape and prints its area. Demonstrate polymorphism by 
passing instances of different subclasses to the printArea() method.*/

package Mock;


abstract class Shape{
	abstract double calculateArea();
}
class Rectangle extends Shape{
	double side = 12.3;
	double area;
	
	@Override
	double calculateArea() {
		area = side * side;
		return area;
	}
}
class Circle extends Shape{
	double radius = 8.1;
	double area;
	
	@Override
	double calculateArea() {
		area = Math.PI* radius * radius;
		return area;
	}
}
class Triangle extends Shape{
	double height = 10.3;
	double base = 16.3;
	double area;
	
	@Override
	double calculateArea() {
		area = (height*base)/2;
		return area;
	}
}
class ShapeCalculator{
	void printArea (Shape shape){
		System.out.println(shape.calculateArea());
		
	}
}
public class Que2 {

	public static void main(String[] args) {
		ShapeCalculator sc= new ShapeCalculator();
		Shape circle= new Circle();
		sc.printArea(circle);
		Shape triangle= new Triangle();
		sc.printArea(triangle);
		Shape rectangle= new Rectangle();
		sc.printArea(rectangle);

	}

}
