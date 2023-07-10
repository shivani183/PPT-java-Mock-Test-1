
/*Create a class called Person with private properties like name, age, and address. Provide public getter and 
setter methods for these properties. Write a program that creates an instance of the Person class, sets values
for its properties using the setter methods, and displays the values using the getter methods.*/

package Mock;

class Person{
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

public class Que3 {

	public static void main(String[] args) {
		Person p1= new Person();
		p1.setName("sachin");
		p1.setAddress("MI");
		p1.setAge(53);
		Person p2= new Person();
		p2.setName("dhoni");
		p2.setAddress("csk");
		p2.setAge(45);
		Person p3= new Person();
		p3.setName("kohli");
		p3.setAddress("rcb");
		p3.setAge(34);
		
		System.out.println("Our first player is "+p1.getName()+" he is in "+p1.getAddress()+" team and he is only "+p1.getAge()+" years old " );
		System.out.println("Our second player is "+p2.getName()+" he is in "+p2.getAddress()+" team and he is only "+p2.getAge()+" years old " );
		System.out.println("Our third player is "+p3.getName()+" he is in "+p3.getAddress()+" team and he is only "+p3.getAge()+" years old " );
		

	}

}
