public class Ex13_MathUse // Math의 목적 수학 관련 연산 기능 제공, 인스턴스 생성 목적 정의 클래스X
{						// Math클래스에 정의된 메서드는 모두 static으로 선언되어 있다.	
	public static void main(String[] args) 
	{
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		System.out.println("log2(8): " + baseLog(8, 2));
		System.out.println("4의 제곱근: " + Math.pow(2, 3));
		System.out.println();
		
		System.out.println("원주율: " + Math.PI);
		System.out.println("파이에 대한 Degree: " + Math.toDegrees(Math.PI));
		System.out.println("2 파이에 대한 Degree: " + Math.toDegrees(2.0 * Math.PI));
		System.out.println();
		
		double radian45 = Math.toRadians(45);	// 라디안으로의 변환!
		
		System.out.println("싸인 45: " + Math.sin(radian45));
		System.out.println("코싸인 45: " + Math.cos(radian45));
		System.out.println("탄젠트 45: " + Math.tan(radian45));

	}
	
	public static double baseLog(double x, double base)
	{
		return Math.log(x) / Math.log(base);
	}

}
