package codeup_100;

import java.util.Scanner;

public class codeup_88 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		while(true) {
			if(i>n) {
				break;
			}
			
			if(i%3==0) {
				
			} else {
				System.out.printf(i+" ");
			}			
			i++;
		}
	}
}
