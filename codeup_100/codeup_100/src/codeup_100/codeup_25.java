package codeup_100;

import java.util.Scanner;

public class codeup_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		a=sc.nextInt();
		int arr[] = new int [5];
		
		for(int i=0;i<5;i++) {
			arr[i]= a%10;
			a=a/10;
		}
		for(int i=4;i>=0;i--) {
			double b = arr[i]*(Math.pow(10,  i));
			System.out.println(Math.round(b));
		}
	}
}
