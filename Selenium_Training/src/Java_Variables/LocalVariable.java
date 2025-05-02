package Java_Variables;

public class LocalVariable {

	
	// Local Variable can be defined with in the method itself
	
	public void display() {
        int number = 10;  // Local variable
        System.out.println("Local variable value: " + number);
    }
	
	

    public static void main(String[] args) {
    	LocalVariable obj = new LocalVariable();
        obj.display();
    }

}
