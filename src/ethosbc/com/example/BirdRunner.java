package ethosbc.com.example;

public class BirdRunner {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.doAction("I am walking.");
		bird.doAction("I am flying.");
		bird.doAction("I am singing.");
		
		Duck duck = new Duck();
		duck.makeSound();
		
		Chicken chicken = new Chicken();
		chicken.makeSound();
		
		Chicken rooster = new Chicken();
		rooster.setGender("Male");
		rooster.makeSound("Cock-a-doodle-doo");
	}
}