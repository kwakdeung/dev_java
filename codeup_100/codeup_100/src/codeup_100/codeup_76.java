package codeup_100;

import java.util.Scanner;

public class codeup_76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char al = sc.nextLine().charAt(0);
		
		for(int i = 0; i<al-97;i++) {
			System.out.printf("$c ",(char)(97+i));
		}
	}
}
