package com.gmail.yu.omelyanchuk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static void oddNumbersCount(){
		int[] mass= {0,5,2,4,7,1,3,19};
		
		int kolvo=0;
		for (int i : mass) {
			if(i%2!=0){
				kolvo++;
			}
		}
		System.out.println("Kolvo odd numbers ="+kolvo);
	}
	private static void createIntMass(){
		Scanner sc = new Scanner(System.in);
		System.out.println("input mass length");
		int n =0;
		n=sc.nextInt();
		int[] mass = new int[n];
		for (int i = 0; i < mass.length; i++) {
			System.out.println("input "+(i+1)+" element");
			mass[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(mass));
		sc.close();
	}
	private static void massMultitiply(){
		int[] mass = new int[15];
		
		for (int i = 0; i < mass.length; i++) {
			mass[i]=(int)(Math.random()*500);
		}
		int[] mass2 =Arrays.copyOf(mass, mass.length*2);
		for (int i = mass.length; i < mass2.length; i++) {
			mass2[i]=mass[i-mass.length]*2;
		}
		System.out.println("original "+Arrays.toString(mass));
		System.out.println("multiply "+Arrays.toString(mass2));
	}
	private static void bSymbolCount(){
		Scanner sc = new Scanner(System.in);
		System.out.println("input string");
		int count=0;
		char[] text;
		
		text=sc.nextLine().toCharArray();
		for (char c : text) {
			if(c==(char)'b'){
				count++;
			}
		}
		System.out.println("Number of characters b = " + count);
		sc.close();
		
	}

	public static void main(String[] args) {
		//task 1
		oddNumbersCount();
		//task 2
		createIntMass();
		//task 3
		massMultitiply();
		//task 4
		bSymbolCount();

	}

}
