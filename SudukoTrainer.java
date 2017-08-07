/**
 * Copyright (c) 2016, Grant W Quinlan. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice and this list of conditions.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice and this list of conditions.
 **     
 */

/**
 * The SudukoTrainer class implements an application for testing various 
 * java components that are part of the SudukoTrainer Android application
 **
 */

public class SudukoTrainer extends SudukoElement {
    public static void main(String[] args) {
        System.out.println("Welcome to the Suduko Trainer!"); // Display the string.
	System.out.println("5/9=" + (5 / 9) + " 24/9=" + (24 / 9));
        SudukoElement[] SEs; 
        System.out.println("Created SEs array");
	SudukoElement se = new SudukoElement(5);
        System.out.println("Created se element with value" + se);
        SudukoValue sv = new SudukoValue(6);
        System.out.println("Created sv element with value" + sv);
        System.out.println("1 sv.compareTo(SV.K4) = " + sv.compareTo(SV.K4));
        System.out.println("0 sv.compareTo(SV.K6) = " + sv.compareTo(SV.K6));
        System.out.println("-1 sv.compareTo(SV.K7) = " + sv.compareTo(SV.K7));


        SEs = new SudukoElement[81];
        System.out.println("Created SEs array with 81 elements");
        for(int i=0; i<81; i++) {
          System.out.println("About to create Element" + i + " with value " + ((i + (i/9)*3 + i/27)%9 + 1));
          SEs[i] = new SudukoElement((i + (i/9)*3 + i/27)%9 + 1);
          System.out.println("Created Element" + i + " with value" + SEs[i]);
 	}
        System.out.println("Created 81 elements with valid values for entry in the SEs array"); 
//        for(int i=0; i<81; i++) {
	
        System.out.println("Printing the values for each element of SEs");
	for(int i=0; i<81; i++) {
          if((i%9)%3 == 2) {
            // Print with underscore
            System.out.print(" +");
	  } else if(i%3 == 0)
            System.out.print(" |");
          System.out.print(SEs[i]);
	}
        System.out.println();	
        System.out.println("se =" + se);
    }
}

