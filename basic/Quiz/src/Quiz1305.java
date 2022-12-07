import java.util.Scanner;

public class Quiz1305 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 사용자로부터 문자열을 입력받은 후
		// 회문인지 아닌지 판단하는 프로그램을 작성하시오.
		// 대소문자까지 동일해야 회문으로 인정함
		
		System.out.println("단어를 입력하세요.");
		String input = sc.nextLine();
		
		
		int sLen = input.length();
		
		String[] sarray = new String[sLen];
		for	(int i=0; i<sLen; i++)
		{
			sarray[i] = input.substring(i, i+1);
		}
		
		int max = sLen / 2;
		boolean bType = true;
		for	(int i=0; i<sLen; i++)
		{
			String s1 = sarray[i];
			String s2 = sarray[sLen - 1 - i];
			
			if(!s1.equals(s2))
			{
				
				bType = false;
				break;
			}
		}
		
		if (bType == true)
		{
		System.out.println("회문입니다.");
		}
		else
		{
		System.out.println("회문이 아닙니다.");
		}
	}
}
