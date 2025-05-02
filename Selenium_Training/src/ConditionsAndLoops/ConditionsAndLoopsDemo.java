package ConditionsAndLoops;

public class ConditionsAndLoopsDemo {

	public static void main(String[] args) {

		// ----------- Conditional Statements -----------

		// 1. if statement
		int age = 18;
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		}

		// 2. if-else statement
		int age2 = 16;
		if (age2 >= 18) {
			System.out.println("You can vote.");
		} else {
			System.out.println("You are too young to vote.");
		}

		// ----------- Loops -----------

		// 1. for loop
		
		//print 1 to 5 numbers
		System.out.println("For loop:");
		for (int i = 1; i <= 5; i++) {

			System.out.println(i);
		}

		// 2. while loop
		System.out.println("While loop:");
		int i = 1;
		while (i <= 5) {
			System.out.println("Value: " + i);
			i++;
		}

		// 3. do-while loop
		System.out.println("Do-while loop:");
		int j = 1;
		do {
			System.out.println("Count: " + j);
			j++;
		} while (j <= 5);
	}
}
