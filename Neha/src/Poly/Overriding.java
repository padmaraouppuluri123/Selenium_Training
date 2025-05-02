package Poly;

public class Overriding extends Overloading

{

	public void add() {
		
		System.out.println("Overide");
	}
		
	public static void main(String[] args) {
		
		Overriding oc= new Overriding();
		oc.add();
	}
}
