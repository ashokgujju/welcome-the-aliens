import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration {

	private Scanner input = new Scanner(System.in);
	private Alien alien = Alien.getInstance();

	public void createAlien() {
		saveCodeName();
		saveBloodColor();
		saveNoOfAntennas();
		saveNoOfLegs();
		saveHomePlanet();

		System.out.println("Registration successful!");
	}

	private void saveCodeName() {
		do {
			System.out.println("Enter Code Name: ");
			alien.setCodeName(input.nextLine());
			try {
				Double.parseDouble(alien.getCodeName());
				System.out.println("Invalid input..! Try again..!");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}

	private void saveBloodColor() {
		do {
			System.out.println("Enter Blood Color: ");
			alien.setBloodColor(input.nextLine());
			try {
				Double.parseDouble(alien.getBloodColor());
				System.out.println("Invalid input..! Try again..!");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}

	private void saveNoOfLegs() {
		do {
			System.out.println("Enter No of Legs: ");
			try {
				alien.setNoOfLegs(input.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input..! Try again..!");
				input.nextLine();
			}
		} while (true);
	}

	private void saveNoOfAntennas() {
		do {
			System.out.println("Enter No of Antennas: ");
			try {
				alien.setNoOfAntennas(input.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input..! Try again..!");
				input.nextLine();
			}
		} while (true);
	}

	private void saveHomePlanet() {
		do {
			input.nextLine();
			System.out.println("Enter Home Planet: ");
			alien.setHomePlanet(input.nextLine());
			try {
				Double.parseDouble(alien.getHomePlanet());
				System.out.println("Invalid input..! Try again..!");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}
}