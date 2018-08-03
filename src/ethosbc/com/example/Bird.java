package ethosbc.com.example;

public class Bird extends Animal {

	private int wingSpan;
	
	public void fly() {
		System.out.println("I am flying.");
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
}