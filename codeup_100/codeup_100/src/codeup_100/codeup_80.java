package codeup_100;

import java.util.Scanner;

public class codeup_80 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		while(true) {
			sum = sum + i;
			if(sum==a||sum>a) {
				System.out.println(i);break;
			}
			i++;
		}
	}
}
