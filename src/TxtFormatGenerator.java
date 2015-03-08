import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFormatGenerator implements FileGenerator {

	private Alien alien = Alien.getInstance();
	private final String FILE_EXTENSION = ".txt";
	public static final String FILE_TYPE = "Plain Text";

	public void export() {
		String fileName = alien.getCodeName() + FILE_EXTENSION;

		try {
			FileWriter fw = new FileWriter(new File(fileName));
			BufferedWriter bw = new BufferedWriter(fw);
			addContent(bw);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("txt file generated..!");
	}

	private void addContent(BufferedWriter bw) throws IOException {
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