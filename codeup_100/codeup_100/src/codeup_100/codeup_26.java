package codeup_100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String date = sc.nextLine();
		
		StringTokenizer token = new StringTokenizer(date,":");
		int [] arr = new int [3];
		int i = 0;
		while(token.hasMoreTokens()) {
			arr[i]=Integer.parseInt(token.nextToken());
			i=i+1;
		}
		System.out.printf("%d", arr[1]);
	}
}
