package codeup_100;

import java.util.Scanner;

public class codeup_90 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int result = a;
		for(int i=2;i<=n;i++) {
			result = result*r;
		}
		System.out.println(result);
	}
}
