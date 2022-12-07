
public class Ex01_StringUse 
{
	// 객체를 가리키는 값만 들어옴
	public static void main(String[] args) // main 브레이크포인트 주고 디버그 RUN
	{
		String str1 = new String("자바프로그래밍");
		String str2 = new String("자바프로그래밍");
		String str3 = "자바프로그래밍";
		String str4 = "자바프로그래밍";
		//디버그 RUN -> 내용이 자바프로그래밍 같은것이 아니라 ID(동일 객체인지 다른 객체인지) 차이
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		// 문자열은 문자와 달리 내용 없이 다음과 같이 사용할 수 있습니다.
		String str5 = "";
		
	}

}
