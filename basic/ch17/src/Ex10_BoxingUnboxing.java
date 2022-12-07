
public class Ex10_BoxingUnboxing //박싱은 "인스턴스의 생성"을 통해서 이뤄짐.
								//언박싱은 래퍼 클래스에 정의된 메서드의 호출을 통해 이뤄진다. "기본 자료형 값만" 꺼내는 것.
{
	public static void main(String[] args) 
	{
		// 박싱
		Integer i0bj = Integer.valueOf(10);
		Double d0bj = Double.valueOf(3.14);
		
		// 메소드 호출을 통한 언박싱
		int num1 = i0bj.intValue();
		double num2 = d0bj.doubleValue();
		
		System.out.println(num1 + " : " + i0bj);
		System.out.println(num2 + " : " + d0bj);
		System.out.println();
		
		// 래퍼 인스턴스 값의 증가 방법
		i0bj = Integer.valueOf(i0bj.intValue() + 10);
		d0bj = Double.valueOf(d0bj.doubleValue() + 1.2);
		
		System.out.println(i0bj);	// 10 + 10
		System.out.println(d0bj);	// 3.14 + 1.2

	}

}
