package tr.bolum12.file.read;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadData {
	public static void main(String[] args) throws IOException {
		File file = new File("score.txt");
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String firstName = input.next() + " " + input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println("FirstName: " + firstName + "\nLastName: " + lastName + "\nScore: " + score);
			System.out.println("=================================================");
		}
		input.close();
	}

}
