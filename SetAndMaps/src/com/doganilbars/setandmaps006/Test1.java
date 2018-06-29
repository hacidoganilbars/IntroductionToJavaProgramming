package com.doganilbars.setandmaps006;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;

import javax.sound.midi.Soundbank;

public class Test1 {
	public static void main(String[] args) throws Exception {

		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:\\test.dat"));
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Adana");
		LinkedHashSet<String> set2 = (LinkedHashSet<String>) set1.clone();
		set1.add("Osmaniye");
		output.writeObject(set1);
		output.writeObject(set2);
		output.close();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\test.dat"));
		set1 = (LinkedHashSet<String>) input.readObject();
		set2 = (LinkedHashSet<String>) input.readObject();
		System.out.println(set1);
		System.out.println(set2);
		input.close();
	}
}
