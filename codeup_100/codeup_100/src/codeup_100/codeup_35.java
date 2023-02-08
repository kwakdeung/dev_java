package codeup_100;

import java.util.Scanner;

public class codeup_35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.nextLine();
		
		int n = Integer.valueOf(b, 16);
		System.out.printf("%o", n);
	}
}
