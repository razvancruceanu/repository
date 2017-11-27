package com.codegile.university.razvan.week1.day1.Problem3a;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) throws IOException  {
		BufferedReader br = null;
		String text = null;
		try {
			br = new BufferedReader(new FileReader("src/fisier.txt"));
			text = br.readLine();
			String name[] = text.split(",");
			List<String> nume = Arrays.asList(name);
			nume.sort(String::compareToIgnoreCase);
			System.out.println(nume);
			for(int i=0; i<name.length;i++) {
				String n = name[i];
				if(isVowel(n.charAt(0))) {
					name[i] = "" + n.length();
				}
				System.out.println(name[i]);
			}	
			
		} finally {
			if (br != null) {
				br.close();
			}
		}

	}
	
	public static boolean isVowel(char c) {
		  return "AEIOUaeiou".indexOf(c) != -1;
		}
	
}
