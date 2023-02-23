package codeup_100;

import java.util.Scanner;

public class codeup_86 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		double result = w*h*b;
		if(result/8.0<1024) {
			System.out.printf("%.2fByte", result/8.0);
		} else if(result/8.0/1024.0<1024) {
			System.out.printf("%.2fKB",result/8.0/1024.0);
		} else if(result/8.0/1024.0/1024.0<1024) {
			System.out.printf("%.2fMB", result/8.0/1024.0/1024.0);
		} else if(result/8.0/1024.0/1024.0/1024.0<1024) {
			System.out.printf("%.2fGB", result/8.0/1024.0/1024.0/1024.0);
		} else {
			System.out.printf("%.2fTB", result/8.0/1024.0/1024.0/1024.0/1024.0);
		}		
	}
}
