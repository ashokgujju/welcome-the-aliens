import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfFormatGenerator implements FileGenerator {

	private final String FILE_EXTENSION = ".pdf";
	public static final String FILE_TYPE = "PDF";

	public void export(Alien alien) {
		String fileName = alien.getCodeName() + FILE_EXTENSION;

		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(fileName));
			document.open();
			addContent(document, alien);
			document.close();

			System.out.println("\nYour details has been exported to pdf file successfully!");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void addContent(Document document, Alien alien) throws DocumentException {
		document.add(new Paragraph("IDENTITY CARD", new Font(Font.FontFamily.TIMES_ROMAN, 18,
			      Font.BOLD)));
		document.add(new Paragraph("Code Name: " + alien.getCodeName()));
		document.add(new Paragraph("Blood Color: " + alien.getBloodColor()));
		document.add(new Paragraph("No of Antennas: " + alien.getNoOfAntennas()));
		document.add(new Paragraph("No of Legs: " + alien.getNoOfLegs()));
		document.add(new Paragraph("Home Planet: " + alien.getHomePlanet()));
	}

	public String getFileType() {
		return FILE_TYPE;
	}

}