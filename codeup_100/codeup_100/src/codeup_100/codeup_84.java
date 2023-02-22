package codeup_100;

import java.util.Scanner;

public class codeup_84 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<g;j++) {
				for(int k=0;k<b;k++) {
					System.out.println(i+" "+j+" "+k);
					sum=sum+1;
				}
			}
		}
		System.out.println(sum);
	}
}
