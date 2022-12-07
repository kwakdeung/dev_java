import java.util.Scanner;

//길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서 홀수와 짝수를
//구분해서 출력하라.

//출력예시) 총 10개의 숫자를 입력하시오.
//1 2 3 ....... 10개입력
//홀수 : 1, 3, 5, 7
//짝수 : 2, 4, 6, 8, 10

public class Q03 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//길이가 10인 배열을 선언하고 
		//총 10개의 정수를 입력받아서 
		//홀수와 짝수를 구분해서 출력하라.
		
		int[] arr = new int[10];
		
		System.out.print("총 10개의 정수를 입력하시오.");
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}	
		// 홀수 출력
		System.out.print("홀수 :");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] % 2 == 1)
			{
			System.out.print(arr[i] + " ");
			}
		}
		System.out.println(" ");
		// 짝수 출력
		System.out.print("짝수 :");
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] % 2 == 0)
			{
			System.out.print(arr[i]+ " ");
			}
		}
		System.out.println(" ");
	}
}
