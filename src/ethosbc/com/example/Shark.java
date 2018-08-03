package ethosbc.com.example;

public class Shark extends Fish {

	public boolean feed(Animal prey) {
		boolean ret = false;
		// it wouldn't make sense for a Shark to feed on Animals not in the sea
		if (null != prey && prey instanceof Fish) {
			System.out.println("Shark is feeding on " + prey.getClass().getSimpleName() + " - " + prey.getName());
			ret = true;
		}
		return ret;
	}
}
