public class Ex07_Number // Number 클래스 - 모든 래퍼 클래스가 상속하는 클래스
{						// Wrapper 클래스 - 메소드->"객체화"->매개변수(객체형태)
	public static void main(String[] args)
	{
		//Integer num1 = new Integer(20);
		Integer num1 = Integer.valueOf(20);
		System.out.println(num1.intValue());
		System.out.println(num1.doubleValue());
		
		Double num2 = Double.valueOf(3.14);
		System.out.println(num2.intValue());
		System.out.println(num2.doubleValue());

	}

}
