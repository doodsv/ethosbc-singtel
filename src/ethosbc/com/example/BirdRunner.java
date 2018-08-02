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
		
		Parrot parrot1 = new Parrot();
		parrot1.setCompanion(new Dog());
		parrot1.makeSound( parrot1.getCompanion() );
		
		Parrot parrot2 = new Parrot();
		parrot2.setCompanion(new Cat());
		parrot2.makeSound( parrot2.getCompanion() );
		
		Parrot parrot3 = new Parrot();
		parrot3.setCompanion(new Chicken());
		parrot3.makeSound( parrot3.getCompanion() );
		
	}
}