package ethosbc.com.example;

public class Animal {
	private String name;
	private String gender;
	private String size;
	private String color;

	private boolean canFly;
	private boolean canWalk;
	private boolean canSing;
	private boolean canSwim;

	public boolean doAction(String action) {
		boolean ret = false;
		if (null != action && !action.isEmpty()) {
			System.out.println(action);
			ret = true;
		}
		return ret;
	}

	public void makeSound() {
		System.out.println("Default animal sound.");
	}

	public boolean makeSound(String sound) {
		boolean ret = false;
		if (null != sound && !sound.isEmpty()) {
			System.out.println(sound);
			ret = true;
		}
		return ret;
	}

	public void feed() {
		System.out.println("I am feeding.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean canFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean canWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean canSing() {
		return canSing;
	}

	public void setCanSing(boolean canSing) {
		this.canSing = canSing;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
}