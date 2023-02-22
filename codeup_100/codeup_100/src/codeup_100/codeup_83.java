package codeup_100;

import java.util.Scanner;

public class codeup_83 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<10) {
			for (int i = 1; i<= n; i++) {
				if(i % 3 == 0) {
					System.out.printf("X ");
				} else {
					System.out.printf("%d ", i);
				}
			}
		}
	}
}
