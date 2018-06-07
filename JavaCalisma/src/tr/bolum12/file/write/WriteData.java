package tr.bolum12.file.write;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
	public static void main(String[] args) throws IOException {
		File file = new File("score.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(1);
		}
		PrintWriter output = new PrintWriter(file);
		output.print("Hacý Doðan Ýlbars ");
		output.println(90);
		output.print("Ali Veli ");
		output.println(85);

		output.close();

	}

}
