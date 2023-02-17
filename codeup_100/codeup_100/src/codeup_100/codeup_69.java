package codeup_100;

import java.util.Scanner;

public class codeup_69 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = sc.nextLine().charAt(0);
		
		if(a=='A') {
			System.out.println("Best!!");
		} else if (a=='B') {
			System.out.println("Good!!");
		} else if (a=='C') {
			System.out.println("run!");
		} else if (a=='D') {
			System.out.println("Slowly~");
		} else {
			System.out.println("what?");
		}		 
	}
}
