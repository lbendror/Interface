package interfaceExample;

public class ZooGame {

	public static void main(String[] args) {
		
		Flyable[] flyers new Flyable[10];
		
		flyers[0] = new Bird();
		flyers[1] = new Bat();
		
		for (Flyable f : flyers) {
			f.fly();
		}
		
	}

}
