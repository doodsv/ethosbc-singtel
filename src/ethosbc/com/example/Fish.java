package ethosbc.com.example;

public class Fish extends Animal {
	
	private int finSpan;
	
	public void swim() {
		System.out.println("I am swimming.");
	}

	public int getFinSpan() {
		return finSpan;
	}
	
	public void setFinSpan(int finSpan) {
		this.finSpan = finSpan;
	}
}
