package codeup_100;

import java.util.Scanner;

public class codeup_48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = (int)Math.pow(2, b);
		System.out.println(a*c);
	}
}
