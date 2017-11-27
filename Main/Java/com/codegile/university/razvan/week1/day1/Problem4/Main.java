package com.codegile.university.razvan.week1.day1.Problem4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = null;
		Tricou tricou = new Tricou();
		try {
			sc = new Scanner(new File("src/fisier.txt"));
			while (sc.hasNext()) {
	            tricou.setId(sc.next());
	            tricou.setDescription(sc.next());
	            tricou.setColor(sc.next());
	            tricou.setSize(sc.next());
	            System.out.println(tricou);
	        }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
