package ArithmeticOperators;

public class LogicalExample {

	// Used to combine conditions.

	public static void main(String[] args) {
		int age = 25;
		System.out.println(age > 18 && age < 30); // true
		System.out.println(age < 18 || age > 60); // false
		System.out.println(!(age > 18)); // false
	}

}
