import java.util.StringTokenizer; // 문자열을 분할하는 클래스이다.

public class Ex09_StringTokenizer // ToKen - 분할한 문자열 
{

	public static void main(String[] args)
	{
		StringTokenizer st1 = new StringTokenizer("a b c");
		
		while (st1.hasMoreTokens())
		{
			System.out.println( st1.nextToken() );
		}
	}

}
