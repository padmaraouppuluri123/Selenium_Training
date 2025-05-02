package Poly;

public class Overriding extends Overloading

// Run time poly

{

	public void add() {

		System.out.println("new");
	}

	public static void main(String[] args) {

		Overriding or = new Overriding();
		or.add();

	}

}
