import java.util.Scanner;

public class Q06T 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 받고 싶은 횟수를 지정하세요.");
		int count = sc.nextInt();
		
		int sum = 0;
		for (int i=0; i<count; i++)
		{
			System.out.println("점수를 정수로 입력하세요.");
			int score = sc.nextInt();
			sum = sum + score;
			
		}
		
		double average = (double)sum / count;
		System.out.printf("평균은 ; %f",average);

	}

}
