package org.softuni;

import java.util.Scanner;

public class _01_SymmetricNumbersInRange {
	
	static int a,b;
	
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Please enter a number between 0 and 998:");
			try {
				a = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.print("Erro please enter valid number:");
			}
			if(a > 0 && a <= 998){
				break;
			}
		}

		//enter the second value
		while(true){
			System.out.printf("Please enter a number between %s and 999:", a);
			try {
				b = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.print("Erro please enter valid number:");
			}

			if(b>a && b <= 999){
				break;
			}
		}
		//logic and output
		for (int i = a; i <= b; i++) {
			char[] numbersArray = Integer.toString(i).toCharArray();
			if(numbersArray[0] == numbersArray[numbersArray.length-1]){
				System.out.println(i);
			}
		}
	}
}
