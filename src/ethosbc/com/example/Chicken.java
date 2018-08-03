package ethosbc.com.example;

public class Chicken extends Bird {

	private int combLength;

	public int getCombLength() {
		return combLength;
	}

	@Override
	public void makeSound() {
        System.out.println("Cluck, cluck");
	}
}