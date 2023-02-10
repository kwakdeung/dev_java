package codeup_100;

import java.util.Scanner;

public class codeup_45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		double c = (double)a/(double)b;
		System.out.printf("%.2f", c);
	}
}
