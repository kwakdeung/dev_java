package codeup_100;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class codeup_36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b = sc.nextLine();
		
		byte[] bytes = b.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes[0]);
	}
}
