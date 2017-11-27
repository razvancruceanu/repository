package com.codegile.university.razvan.week1.day1.Problem1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;


public class Main {

    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("fisier.txt");
        BufferedReader br = new BufferedReader(in);
        int count1=0, count2=0;
        try {
            String line =  br.readLine();
            while ( line != null) {
                try {
                    double numar = Double.parseDouble(line);
                    if (numar % 1 == 0)
                        count1++;
                    else
                        count2++;
                    line = br.readLine();

                } catch (NullPointerException ignored) {
                }
                Collator.getInstance().compare("ceva", "altceva");
            }
        }
        finally {
            br.close();
        }


        System.out.println("Sunt " + count2 + " numere reale.");
        System.out.println("Sunt " + count1 + " numere intregi.");
        }
    }