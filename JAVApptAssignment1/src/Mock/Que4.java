
/*Create an interface called Drawable with a method draw() that has no implementation. 
 * Implement this interface in classes Circle and Rectangle. Write a program that 
 * creates objects of Circle and Rectangle and calls the draw() method on each object.
*/
package Mock;

interface Drawable{
	void draw();
}
class Circle1 implements Drawable{

	@Override
	public void draw() {
		System.out.println("A circle has no sides and it can be drawn with the help of compass");
	}
}
class Rectangle1 implements Drawable{
	
	@Override
	public void draw() {
		System.out.println("A rectangle has two sides and it can be drawn with the help of scale");
	}
}
public class Que4 {

	public static void main(String[] args) {
		Drawable rectangle= new Rectangle1();
		rectangle.draw();
		
		Drawable circle= new Circle1();
		circle.draw();

	}

}
