import java.util.Scanner;

public class Registration {

	private Scanner input = new Scanner(System.in);

	public Alien createAlien() {
		System.out.println("We need some of your details to identify you on the earth..!");
		System.out.println("Please provide the following details...!\n");
		
		Alien alien = new Alien();
		alien.setCodeName(getString("Enter Your Code Name: "));
		alien.setBloodColor(getString("Enter Your Blood Color: "));
		alien.setNoOfAntennas(getNumber("Enter No of Antennas You Have: "));
		alien.setNoOfLegs(getNumber("Enter No of Legs You Have: "));
		alien.setHomePlanet(getString("Enter Your Home Planet Name: "));

		System.out.println("Your have registered successfully!\n");

		return alien;
	}

	private int getNumber(String message) {
		do {
			System.out.println(message);
			try {
				return Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input..! It should be an Integer..!\n");
			}
		} while (true);

	}

	private String getString(String message) {
		String str = null;
		do {
			System.out.println(message);
			str = input.nextLine();
			try {
				Double.parseDouble(str);
				System.out.println("Invalid input..! It should be a String..!\n");
			} catch (NumberFormatException e) {
				break;
			}
		} while (true);
		return str;
	}

}