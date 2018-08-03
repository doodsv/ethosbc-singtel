package ethosbc.com.example;

public class Duck extends Bird {

	private String palmateFeetColor;

	public String getPalmateFeetColor() {
		return palmateFeetColor;
	}

	public void setPalmateFeetColor(String color) {
		this.palmateFeetColor = color;
	}

	@Override
	public void makeSound() {
        System.out.println("Quack, quack");
	}
}