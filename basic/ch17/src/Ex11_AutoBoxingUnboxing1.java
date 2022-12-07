
public class Ex11_AutoBoxingUnboxing1 
{

	public static void main(String[] args) 
	{
		// 오토 박싱 - 기본 자료형을 "래퍼클래스로 자동 형변환" 시켜주는 행위
		
		Integer i0bj = 10;
		Double d0bj = 3.14;
		
		// 오토 언박싱 - 래퍼클래스를 "기본 자료형으로 자동 형변환" 시켜주는 행위
		
		int num1 = i0bj;
		double num2 = d0bj;
		
		System.out.println(num1 + " : " + i0bj);
		System.out.println(num2 + " : " + d0bj);

	}

}
