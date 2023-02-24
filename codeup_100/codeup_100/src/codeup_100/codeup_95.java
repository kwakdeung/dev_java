package codeup_100;

import java.util.Scanner;

public class codeup_95 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int [n];
		int min = 24;
		for(int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
