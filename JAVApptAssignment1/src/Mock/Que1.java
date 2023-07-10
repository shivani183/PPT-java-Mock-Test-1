
/*1. Create a superclass called Animal with a method makeSound() that prints the sound made by the animal. Implement subclasses 
Dog, Cat, and Cow that inherit from the Animal class. Implement the makeSound() method in each subclass to print the sound made
by a dog, cat, and cow, respectively.
*/

package Mock;

class Animal {
	void makeSound() {
		System.out.println("Different animal makes different sounds");
	}
}

class Dog extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Dog barks like bhoww bhoww..");
	}
}

class Cat extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Cat sounds like meoww meoww..");
	}
}

class Cow extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Cow make sounds like maaa maaa..");
	}
}

public class Que1 {

	public static void main(String[] args) {
		Animal pet = new Animal();
		pet.makeSound();
		Animal dog = new Dog();
		dog.makeSound();
		Animal cat = new Cat();
		cat.makeSound();
		Animal cow = new Cow();
		cow.makeSound();
	}

}
