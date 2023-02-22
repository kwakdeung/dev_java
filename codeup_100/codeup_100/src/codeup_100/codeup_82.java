package codeup_100;

import java.util.Scanner;

public class codeup_82 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		for(int i = 1; i <= 15; i++) {
			System.out.printf(a + " * %X = %X %n",i, Integer.parseInt(a, 16)*i);
		}
	}
}
