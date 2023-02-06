package codeup_100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringTokenizer token = new StringTokenizer(a, ".");
		int [] arr = new int[2];
		int i = 0;
		while(token.hasMoreTokens()) {
			arr[i]=Integer.parseInt(token.nextToken());
			i = i + 1;
		}
		String f = String.format("%d", arr[0]);
		String b = String.format("%d", arr[1]);
		System.out.println(f);
		System.out.println(b);
	}
}
