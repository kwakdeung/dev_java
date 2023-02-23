package codeup_100;

import java.util.Scanner;

public class codeup_87 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(true) {
			if(sum>=n) {
				System.out.println(sum);break;
			}
			sum = sum + i;
			i++;
		}
	}
}
