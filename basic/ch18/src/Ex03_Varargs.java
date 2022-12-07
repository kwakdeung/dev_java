
public class Ex03_Varargs // 가변 인자- 매개변수를 동적으로 받을 수 있는 방법
						// 매서드 인수 개수가 가변적인 것 //우리 계열은 잘 안 사용
{
	public static void helloEverybody(String... vargs) // 가변 인수 표시
	{
		for (String s : vargs)	// 가변 인수 사용
			System.out.println(s + '\t');
		System.out.println();
	}
	
	
	public static void main(String[] args)
	{
		helloEverybody("홍길동");
		helloEverybody("홍길동", "전우치");
		helloEverybody("홍길동", "전우치", "손오공");
	}
}
