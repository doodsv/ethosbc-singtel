package ethosbc.com.example;

public class Parrot extends Bird {

	private Animal companion;

	public Animal getCompanion() {
		return companion;
	}

	public void setCompanion(Animal companion) {
		this.companion = companion;
	}

	public boolean makeSound(Animal companion) {
		boolean ret = false;
		if (null != companion) {
			if (companion instanceof Dog) {
				System.out.println("Woof, woof");
			} else if (companion instanceof Cat) {
				System.out.println("Meow");
			} else if (companion instanceof Chicken) {
				System.out.println("Cock-a-doodle-doo");
			} else if (companion instanceof Duck) {
				System.out.println("Quack, quack");
			} else {
				System.out.println("default parrot sound");
			}
			ret = true;
		}
		return ret;
	}

}