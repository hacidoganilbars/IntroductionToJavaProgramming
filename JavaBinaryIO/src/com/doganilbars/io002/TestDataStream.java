package com.doganilbars.io002;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	public static void main(String[] args) throws IOException {

		try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
			output.writeUTF("Hac�");
			output.writeDouble(85.5);
			output.writeUTF("Do�an");
			output.writeDouble(185.5);
			output.writeUTF("�lbars");
			output.writeDouble(105.25);
		}

		try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}

	}

}
