import java.util.Arrays;
import java.util.List;

// reduce - 스트림의 요소를 "소모"하며 연산 수행
public class Ex07_Reduce
{
	public static void main(String[] args) 
	{
		List<String> list1 = Arrays.asList("홍길동", "전우치", "손오공");
		
		String name1 = list1.stream()
				.reduce("이순신", (s1,s2) ->
					s1.length() >= s2.length() ? s1 : s2);	// 글자 길이 제일 긴 것 출력 
		System.out.println(name1);	// 홍길동, 전우치, 손오공 소모
		
		List<String> list2 = Arrays.asList("홍길동", "멀린", "해리포터");
		
		String name2 = list2.stream()
				.reduce("이순신", (s1, s2) ->
					s1.length() >= s2.length() ? s1 : s2); 	// 글자 길이 제일 긴 것 출력 
		System.out.println(name2); // 홍길동, 멀린, 이순신 소모

	}

}
