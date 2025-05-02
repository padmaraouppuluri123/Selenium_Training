package Java_Variables;

public class InstanceVariable {

	// Definition: Variables declared inside the class but outside any method are
	// called instance variables
	int age = 25; // Instance variable

	public void showAge() {
		System.out.println("Age is: " + age);
	}
	
	public void name() {
		
		System.out.println(age);
	}

	public static void main(String[] args) {
		InstanceVariable person1 = new InstanceVariable();
		person1.showAge();
		person1.name();

	}
}
