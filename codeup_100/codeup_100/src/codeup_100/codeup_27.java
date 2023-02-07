package codeup_100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(date, ".");
		int [] arr = new int [3];
		int i = 0;
		while(token.hasMoreTokens()) {
			arr[i]=Integer.parseInt(token.nextToken());
			i = i + 1;
		}
		System.out.printf("%02d-%02d-%04d", arr[2], arr[1], arr[0]);
	}
}
