package ethosbc.com.example;

public class Dog extends Animal {

	private int pawSize;

	public int getPawSize() {
		return pawSize;
	}
	
	@Override
	public void makeSound() {
        System.out.println("Roof, roof");
	}
}