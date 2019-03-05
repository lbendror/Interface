package interfaceExample;

public class Bird extends Animal implements Flyable{

	public void makeSound() {
		System.out.println("Tweet");
	}
	
	public void fly() {
		System.out.println("Bird is flying");
	}
	
	public int getCurrentElevation() {
		return 0;
	}
}
