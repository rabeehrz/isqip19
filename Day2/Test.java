public class Test {
	public static void main(String[] val) {
		// System.out.println("Hello, World!");
		Bike pulsar = new Bike("Bullet");
		// pulsar.startEngine();
		System.out.println(pulsar.getColor());
		pulsar.setColor("Black");
		System.out.println(pulsar.getColor());
	}
}