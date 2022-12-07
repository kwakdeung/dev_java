
public class Ex07_length // 문자열의 길이 구하기
{

	public static void main(String[] args)
	{
		String str = "apple";
		for (int i=0; i<str.length(); i++) // str.trim()->공백을 없애줌
		{
			char ch = str.charAt(i); // index가 지정한 문자를 반환합니다.
			if (ch == 'l')
				break;
			System.out.println(ch);
		}

	}

}
