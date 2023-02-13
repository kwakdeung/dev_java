package codeup_100;

import java.util.Scanner;

public class codeup_46 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a+b+c);
		double d = (double)(a+b+c)/3;
		System.out.printf("%.1f",d);
	}
}
