import java.util.InputMismatchException;
import java.util.Scanner;

public class Registration {

	private Scanner input = new Scanner(System.in);
	private Alien alien = new Alien();

	public Registration() {
		System.out.println("We need some of your details to identify you on the earth..!");
		System.out.println("Please provide us the following details...!\n");
	}

	public Alien createAlien() {
		saveCodeName();
		saveBloodColor();
		saveNoOfAntennas();
		saveNoOfLegs();
		saveHomePlanet();
		
		System.out.println("Your have successfully registeredl!\n");
		
		return alien;
	}

	private void saveCodeName() {
		do {
			System.out.println("Enter Your Code Name: ");
			alien.setCodeName(input.nextLine());
			try {
				Double.parseDouble(alien.getCodeName());
				System.out.println("Invalid input..! It should be a String..!\n");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}

	private void saveBloodColor() {
		do {
			System.out.println("Enter Your Blood Color: ");
			alien.setBloodColor(input.nextLine());
			try {
				Double.parseDouble(alien.getBloodColor());
				System.out.println("Invalid input..! It should be a String..!\n");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}

	private void saveNoOfLegs() {
		do {
			System.out.println("Enter No of Legs You Have: ");
			try {
				alien.setNoOfLegs(input.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input..! It should be an Integer..!\n");
				input.nextLine();
			}
		} while (true);
	}

	private void saveNoOfAntennas() {
		do {
			System.out.println("Enter No of Antennas You Have: ");
			try {
				alien.setNoOfAntennas(input.nextInt());
				break;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input..! It should be an Integer..!\n");
				input.nextLine();
			}
		} while (true);
	}

	private void saveHomePlanet() {
		do {
			input.nextLine();
			System.out.println("Enter Your Home Planet: ");
			alien.setHomePlanet(input.nextLine());
			try {
				Double.parseDouble(alien.getHomePlanet());
				System.out.println("Invalid input..! It should be a String..!\n");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
	}
}