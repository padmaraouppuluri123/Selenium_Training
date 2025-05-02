package Java_Variables;

public class StaticVarible {

	// Definition: Declared using the static keyword. Belongs to the class itself,
	// not to instances. Shared by all objects of the class.

	static String companyName = "TechCorp"; // Static variable

	public void display() {
		System.out.println("Company: " + companyName);
	}

	public static void main(String[] args) {
		StaticVarible emp1 = new StaticVarible();
		StaticVarible emp2 = new StaticVarible();

		emp1.display();
		emp2.display();

		// Changing static variable value
		StaticVarible.companyName = "CodeLabs";
		emp1.display(); // Reflects updated name
		emp2.display(); // Also reflects updated name
	}
}
