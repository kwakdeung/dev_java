package codeup_100;

import java.util.Scanner;

public class codeup_93 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr [] = new int [23];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			a=a-1;
			arr[a]=arr[a]+1;
		}
		for(int i=0; i<23; i++) {
			System.out.printf(arr[i]+ " ");
		}
	}
}
