package codeup_100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		StringTokenizer token = new StringTokenizer(time,":");
		int[] arr = new int[2];
		int i=0;
		while(token.hasMoreTokens()) {
			arr[i] = Integer.parseInt(token.nextToken());
			i = i + 1;
		}
		String h = String.format("%d", arr[0]);
		String m = String.format("%d", arr[1]);
		
		System.out.printf(h + ":" + m);
	}
}
