public abstract class Vehicle {
	public void initMotor() {
		System.out.println("Motor initiated");
		motorStarted();
	}
	public abstract void motorStarted();
}