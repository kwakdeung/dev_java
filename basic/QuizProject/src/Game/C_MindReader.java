package Game;

//게임설명 :
//내가 생각한 숫s자를 컴퓨터가 맞춘다.
//내가 생각한 숫자보다 크면 h 라고 입력한다.
//내가 생각한 숫자보다 작으면 l 이라고 입력한다.
//내가 생각한  숫자와 같으면 y 라고 s입력한다.



import java.util.Random;
import java.util.Scanner;

public class C_MindReader {
	public static void main(String[] args) 
	{
		System.out.println("0부터 100사이의 값 중에 하나를 생각하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 크면 h를 입력하세요.");
		System.out.println("제(컴)가 제시한 숫자가 생각한 숫자보다 작으면 l을 입력하세요.");
		System.out.println("제(컴)가 숫자를 맞췄다면 y를 입력해 주세요.");
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int min = 0;
		int max = 100;
		while(true)
		{
			count++;
			
			int result = (max - min) / 2 + min;
			System.out.printf("당신이 선택한 숫자는 %d입니까?", result);
			String input = sc.nextLine();
			if(input.equals("h")) // equals - 내용이 같은지 검사
			{
				max = result;	// 절반 50이 최대값으로 변경
			}
			else if(input.equals("l"))
			{
				min = result;	// 최소값 절반으로
			}
			else if(input.equals("y"))
			{
				System.out.printf("정답입니다. [%d회차]", count);
				System.out.println(" ");
				System.out.println("Good Bye ~");
				break;
			}
			else
			{
				System.out.println("잘못된 문자를 입력하였습니다.");
				count--;
			}
		}
		
		sc.close();
	}
}