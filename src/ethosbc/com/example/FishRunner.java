package ethosbc.com.example;

public class FishRunner {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.doAction("I am swimming.");

		Shark shark = new Shark();
		shark.setSize("large");
		shark.setColor("grey");

		ClownFish clownFish = new ClownFish();
		clownFish.setSize("small");
		clownFish.setColor("orange");
		clownFish.setName("Nemo");

		shark.feed(clownFish);
		clownFish.doJoke();

		Dolphin dolphin = new Dolphin();
		dolphin.swim();
	}
}