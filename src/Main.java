public class Main {

	public static void main(String[] args) {
		System.out.println("Hi there!, Welcome To Earth..!\n");

		Alien alien = new Registration().createAlien();
		OutputGenerator output = new OutputGenerator();
		output.exportDetailsToFile(alien);
	}
}