package ethosbc.com.example;

public class Cat extends Animal {

	private int whiskerLength;

	public int getWhiskerLength() {
		return whiskerLength;
	}
	
	@Override
	public void makeSound() {
        System.out.println("Meow, meow");
	}

}