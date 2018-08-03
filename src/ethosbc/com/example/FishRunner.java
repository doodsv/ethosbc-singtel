package ethosbc.com.example;

public class FishRunner {
	public static void main(String[] args) {
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
	}
}