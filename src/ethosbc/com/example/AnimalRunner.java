package ethosbc.com.example;

public class AnimalRunner {
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
		duck.setCanWalk(true);
		
		Chicken chicken = new Chicken();
		chicken.makeSound();
		chicken.setCanFly(true);
		chicken.setCanWalk(true);
		
		Chicken rooster = new Chicken();
		rooster.setGender("Male");
		rooster.makeSound("Cock-a-doodle-doo");
		rooster.setCanFly(true);
		rooster.setCanWalk(true);
		
		Parrot parrot = new Parrot();
		parrot.setCompanion(new Dog());
		parrot.makeSound( parrot.getCompanion() );
		parrot.setCanFly(true);
		parrot.setCanWalk(true);
		
		Fish fish = new Fish();
		fish.doAction("I am swimming.");
		fish.setCanSwim(true);

		Shark shark = new Shark();
		shark.setSize("large");
		shark.setColor("grey");
		shark.setCanSwim(true);

		ClownFish clownFish = new ClownFish();
		clownFish.setSize("small");
		clownFish.setColor("orange");
		clownFish.setName("Nemo");
		clownFish.setCanSwim(true);

		shark.feed(clownFish);
		clownFish.doJoke();

		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		dolphin.setCanSwim(true);
		
		Dog dog = new Dog();
		dog.makeSound();
		dog.setCanWalk(true);
		dog.setCanSwim(true);
		
		Cat cat = new Cat();
		cat.makeSound();
		cat.setCanWalk(true);
		cat.setCanSwim(true);
		
		Animal[] animals = new Animal[] { 
			bird, 
			duck, 
			chicken, 
			parrot, 
			fish, 
			shark, 
			clownFish, 
			dolphin, 
			dog,
			// new Butterfly(),
			cat 
		};
		
		int canFlyCtr = 0, canWalkCtr = 0, canSingCtr = 0, canSwimCtr = 0;
		for (Animal animal : animals) {
			if (animal.canFly()) ++canFlyCtr;
			if (animal.canWalk()) ++canWalkCtr;
			if (animal.canSing()) ++canSingCtr;
			if (animal.canSwim()) ++canSwimCtr;
		}
		
		System.out.println("\nStats: \n" 
				+ "Can Fly: " + canFlyCtr + "\n" 
				+ "Can Walk: " + canWalkCtr + "\n"
				+ "Can Sing: " + canSingCtr + "\n" 
				+ "Can Swim: " + canSwimCtr + "\n");
	}
}