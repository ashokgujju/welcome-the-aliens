import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFormatGenerator implements FileGenerator {
	
	private final String FILE_EXTENSION = ".txt";
	public static final String FILE_TYPE = "Plain Text";

	public void export(Alien alien) {
		String fileName = alien.getCodeName() + FILE_EXTENSION;

		try {
			FileWriter fw = new FileWriter(new File(fileName));
			BufferedWriter bw = new BufferedWriter(fw);
			addContent(bw, alien);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("\nYour details has been exported to pdf file successfully!");
		System.out.println("Please use this file to identify yourself on the earth!");
		System.out.println("Bye, Have a good time!");
	}

	private void addContent(BufferedWriter bw, Alien alien) throws IOException {
		bw.write("Code Name: " + alien.getCodeName());
		bw.newLine();
		bw.write("Blood Color: " + alien.getBloodColor());
		bw.newLine();
		bw.write("No of Antennas: " + alien.getNoOfAntennas());
		bw.newLine();
		bw.write("No of Legs: " + alien.getNoOfLegs());
		bw.newLine();
		bw.write("Home Planet: " + alien.getHomePlanet());
	}

	public String getFileType() {
		return FILE_TYPE;
	}

}