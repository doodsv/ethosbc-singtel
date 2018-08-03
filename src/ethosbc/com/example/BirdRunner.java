package ethosbc.com.example;

public class BirdRunner {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.doAction("I am walking.");
		bird.doAction("I am flying.");
		bird.doAction("I am singing.");
		bird.setCanFly(true);
		bird.setCanWalk(true);
		
		Duck duck = new Duck();
		duck.makeSound();
		duck.setCanFly(true);
		
		Chicken chicken = new Chicken();
		chicken.makeSound();
		chicken.setCanFly(true);
		chicken.setCanWalk(true);
		
		Chicken rooster = new Chicken();
		rooster.setGender("Male");
		rooster.makeSound("Cock-a-doodle-doo");
		rooster.setCanFly(true);
		rooster.setCanWalk(true);
		
		Parrot parrot1 = new Parrot();
		parrot1.setCompanion(new Dog());
		parrot1.makeSound( parrot1.getCompanion() );
		parrot1.setCanFly(true);
		parrot1.setCanWalk(true);
		
		Parrot parrot2 = new Parrot();
		parrot2.setCompanion(new Cat());
		parrot2.makeSound( parrot2.getCompanion() );
		parrot2.setCanFly(true);
		parrot2.setCanWalk(true);
		
		Parrot parrot3 = new Parrot();
		parrot3.setCompanion(new Chicken());
		parrot3.makeSound( parrot3.getCompanion() );
		parrot3.setCanFly(true);
		parrot3.setCanWalk(true);
	}
}