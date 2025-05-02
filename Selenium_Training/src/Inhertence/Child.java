package Inhertence;

public class Child extends Parent{
	
	
	// Acquirng prop from one class to other class
	
	// code reusability
	
	// readbility
	
	// extensibility
	
	public void owncar() {
		
		System.out.println("child has own car");
		
	}
	
	public static void main(String[] args) {
		
		Child ch=new Child();
		ch.car();
		ch.land();
		ch.house();
		ch.owncar();
		
	}

}
