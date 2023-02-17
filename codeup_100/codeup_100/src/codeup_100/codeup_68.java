package codeup_100;

import java.util.Scanner;

public class codeup_68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=90&&a<=100) {
			System.out.println("A");
		} else if(a<90&&a>=70) {
			System.out.println("B");
		} else if(a<70&&a>=40) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
	}
}
