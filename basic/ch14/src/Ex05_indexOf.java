
public class Ex05_indexOf // 문자열에서 문자 찾기 
{

	public static void main(String[] args) 
	{
		String str = "AppleBananaOrange"; // A부터 a까지 0~6
		int num1 = str.indexOf("a");
		int num2 = str.indexOf("a", num1 + 1);
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
