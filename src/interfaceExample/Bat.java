package interfaceExample;

public class Bat extends Mammal implements Flyable{
	
	public void fly() {
		System.out.println("Bat is flying");
	}
	
	public int getCurrentElevation() {
		return 0;
	}
	
	public void makeSound() {
		System.out.println("Bat sound...");
	}
	

}
