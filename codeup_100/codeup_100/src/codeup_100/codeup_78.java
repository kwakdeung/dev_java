package codeup_100;

import java.util.Scanner;

public class codeup_78 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println(sum);
	}
}
