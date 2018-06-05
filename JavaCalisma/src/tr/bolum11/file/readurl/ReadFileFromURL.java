package tr.bolum11.file.readurl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
	public static void main(String[] args) {
		System.out.print("Enter a URL: ");
		@SuppressWarnings("resource")
		String URLString = new Scanner(System.in).next();
		URL url = null;
		Scanner input = null;
		try {
			url = new URL(URLString);
			int count = 0;
			input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
				// System.out.println(line);
			}
			System.out.println("The file size is " + count + " characters");
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("I/O Errors: no such file");
		} finally {
			input.close();
		}
	}

}
