package com.doganilbars.recursion010;

import java.io.File;
import java.util.Scanner;

public class DirectorySize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a directory or a file: ");
		String directory = input.nextLine();

		System.out.println(getSize(new File(directory)) + " bytes");
		input.close();
	}

	private static long getSize(File file) {
		long size = 0;
		if (file.isDirectory()) {
			File[] files = file.listFiles();

			for (int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]);
			}
		} else {
			size += file.length();
		}
		return size;
	}
}
