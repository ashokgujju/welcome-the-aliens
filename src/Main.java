
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome To Earth");
		registration();
		exportDataToFile();
	}

	private static void exportDataToFile() {
		OutputGenerator output = new OutputGenerator();
		output.generateFile();
	}

	private static void registration() {
		Registration registration = new Registration();
		registration.createAlien();
	}

}