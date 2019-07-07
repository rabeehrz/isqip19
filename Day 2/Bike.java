public class Bike extends Vehicle {
	final int wheels = 2;
	private String color = "Red";
	String name;

	Bike(String name) {
		this.name = name;
	}

	public void startEngine() {
		super.initMotor();
	}

	@Override
	public void motorStarted() {
		System.out.println("Engine started");
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}