import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.filefilter.WildcardFilter;

public class OutputGenerator {

	private Scanner input = new Scanner(System.in);
	private HashMap<String, FileGenerator> fileGenerators;

	public void generateFile() {
		fileGenerators = getAvailFileGenerators();
		FileGenerator generator = chooseFileFormat();
		generator.export();
	}

	private FileGenerator chooseFileFormat() {
		Set<String> formats = fileGenerators.keySet();
		do {
			System.out.println("Available File formats:");
			for (String format : formats) {
				System.out.println(format);
			}

			System.out.println("Enter your choice: ");
			String choice = input.nextLine();
			if (formats.contains(choice)) {
				return fileGenerators.get(choice);
			} else {
				System.out.println("Invalid input.. Try again..!");
			}
		} while (true);
	}

	private HashMap<String, FileGenerator> getAvailFileGenerators() {
		HashMap<String, FileGenerator> generators = new HashMap<String, FileGenerator>();
		File dir = new File("src");
		FileFilter fileFilter = new WildcardFilter("*FormatGenerator.java");
		File[] files = dir.listFiles(fileFilter);

		for (File file : files) {
			try {
				Class<?> cls = Class.forName(file.getName().replaceAll("\\..*",
						""));
				FileGenerator generator = (FileGenerator) cls.newInstance();
				generators.put(generator.getFileType(), generator);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return generators;

	}

}
