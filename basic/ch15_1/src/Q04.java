import java.util.Scanner;

//길이가 10인 배열을 선언한후 총 10개의 정수를 입력받는다.
//단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
//출력예시) 총 10개의 정수를 입력하시오.
// 결과 : 1 3 5 7 9 10 8 6 4 2
public class Q04 // 배열 하나 선언 - 앞 뒤로 집어 넣는 문제
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 길이가 10인 배열을 선언한후
		// 총 10개의 정수를 입력받는다.
		// 단 홀수는 배열의 앞에서 부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.
		
		int[] arr = new int[10];
		
		int min = 0;
		int max = 9;
	
		for(int i = 0; i<arr.length; i++) 
		{
			int num = sc.nextInt();
			if (num % 2 == 1)
			{
				arr[min] = num;
				min = min + 1;
			}
			else
			{
				arr[max] = num;
				max = max - 1;
			}
		}
		for(int i = 0; i<arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		

	}

}
