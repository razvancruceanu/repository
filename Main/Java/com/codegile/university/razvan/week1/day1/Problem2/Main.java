package com.codegile.university.razvan.week1.day1.Problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader br = null;
		String text = null;
		try {
			br = new BufferedReader(new FileReader("src/fisier.txt"));
			text = br.readLine();
			String name[] = text.split(",");
			int count=0;
			 for(int i=0; i<name.length; i++){ 
				if(numeIdeal(name[i])) {
					count++;
				}
			}
			System.out.println("Fisierul are " + count + " nume ideale.");
			
		} finally {
			if (br != null) {
				br.close();
			}
		}

	}

	public static boolean numeIdeal(String name) {
		char[] chars = name.toCharArray();

		for (char c : chars) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}

		if (!Character.isUpperCase(chars[0]))
			return false;

		boolean ok = true;
		for (int i = 1; i < chars.length; i++) {
			if (!Character.isLowerCase(chars[i]))
				ok = false;
		}
		if (!ok)
			return false;

		return true;
	}

}
