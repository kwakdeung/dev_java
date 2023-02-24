package codeup_100;

import java.util.Scanner;

public class codeup_96 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x;
		int y;
		
		int arr[][]=new int [20][20];
		
		for(int i = 1; i<=n ; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			arr[x][y]=1;
		}
		for(int i = 1; i < 20; i++) {
			for(int j=1;j<20;j++) {
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
