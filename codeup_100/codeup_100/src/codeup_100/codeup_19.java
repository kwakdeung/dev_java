package codeup_100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class codeup_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		StringTokenizer token = new StringTokenizer(time, ".");
		int[] arr = new int[3];
		int i = 0;
		while(token.hasMoreTokens()) {
			arr[i] = Integer.parseInt(token.nextToken());
			i = i + 1;
		}
		String y = String.format("%d", arr[0]);
		String m = String.format("%02d", arr[1]);
		String day = String.format("%02d", arr[2]);
		
		System.out.printf(y + "." + m + "." + day);
	}
}
