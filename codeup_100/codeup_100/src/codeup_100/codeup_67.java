package codeup_100;

import java.util.Scanner;

public class codeup_67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}			
		} else {
			System.out.println("plus");
			 if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}

}
