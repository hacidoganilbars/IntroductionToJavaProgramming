package tr.bolum11.file.read;

import java.io.File;
import java.util.Scanner;

public class ReadDataWithOutoClose {
	public static void main(String[] args) throws Exception {
		File file = new File("score.txt");
		try (Scanner input = new Scanner(file)) {
			while (input.hasNext()) {
				String name = input.next() + " " + input.next();
				String surname = input.next();
				int score = input.nextInt();
				System.out.println("First Name: " + name + "\nLast Name: " + surname + "\nScore: " + score);
				System.out.println("===================================");
			}

		}
	}

}
