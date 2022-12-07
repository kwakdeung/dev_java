import java.util.Scanner;

//길이가 5인 int형 배열을 선언해서 사용자로부터 5개의 정수를 입력받는다.	
//그리고 최대값, 최소값, 모든 수의 합을 구하라. 함수(최대,최소,합)를 정의하여 구현하시오.

public class Q01 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();			
		}	
		
		// 최대값, 최소값, 모든 수의 합 구하기
//		int max = arr[0];
//		int min = arr[0];
//		int sum = 0;
//		
//		
//		for(int i = 0 ; i < arr.length; i++)
//		{
//			 if (arr[i] > max) max = arr[i];
//			 if (arr[i] < min) min = arr[i];
//			 sum = sum + arr[i]; 
//		}
//		
//		System.out.println("최대값 : " + max );	
//		System.out.println("최소값 : " + min);
//		System.out.println("모든 수의 합 : " + sum);
	}
	
	public static void getMax(int[] arr)
	{
		int max = arr[0];
		for (int i=0; i<arr.length;i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
		}
	}

}
