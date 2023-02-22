package codeup_100;

import java.util.Scanner;

public class codeup_85 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();
		double result = h*b*c*s;
		if(result/8.0<1024) {
			System.out.printf("%.1fByte",result/8.0);
		} else if (result/8.0/1024.0<1024) {
			System.out.printf("%.1fKB",result/8.0/1024.0<1024);
		} else if (result/8.0/1024.0/1024.0<1024) {
			System.out.printf("%.1fMB",result/8.0/1024.0/1024.0);
		} else if (result/8.0/1024.0/1024.0/1024.0<1024) {
			System.out.printf("%.1fGB",result/8.0/1024.0/1024.0/1024.0);
		} else {
			System.out.printf("%.1fTB",result/8.0/1024.0/1024.0/1024.0/1024.0);
		}
	}

}
