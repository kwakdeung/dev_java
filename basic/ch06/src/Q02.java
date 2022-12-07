import java.util.Scanner;

public class Q02
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하고 엔터를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("영어 점수를 입력하고 엔터를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("수학 점수를 입력하고 엔터를 입력하세요.");
		int num3 = sc.nextInt();
		
		double result1 = (num1 + num2 + num3) / 3;
				
		System.out.printf("평균값은? ", result1);
		
		if (result1 >= 90)				
		{
			System.out.println("당신의 등급은 A입니다.");
		}
		else if (result1 >= 80)				
		{
			System.out.println("당신의 등급은 B입니다.");
		}
		else if (result1 >= 70)				
		{
			System.out.println("당신의 등급은 C입니다.");
		}		
		else if (result1 >= 50)				
		{
			System.out.println("당신의 등급은 D입니다.");
		}			
		else			
		{
			System.out.println("당신의 등급은 F입니다.");
		}			
		

	}

}


