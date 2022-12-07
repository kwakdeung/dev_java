// 익명 내부 클래스
// 클래스의 이름을 생략한 것이 익명 내부 클래스이다.(나 혼자만 사용하기 때문에)
// 람다식과도 관련이 있다.

interface Unit4
{
	void move();	
}

class HumanCamp4
{
	private int speed = 10;
	
	public Unit4 getMarine()
	{
//		class Marine4 implements Unit4
//		{
//			public void move()
//			{
//				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
//			}
//		}
//		
//		return new Marine3();
		// 이름이 없으므로 부모 클래스나 인터페이스의 이름을 사용
		return new Unit4()
		{
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		};	// 하나의 실행문이므로 세미콜론으로 끝납니다.
	
	}
	
}

public class Ex04_AnonymousInner2 
{

	public static void main(String[] args) 
	{
		HumanCamp4 hc = new HumanCamp4();
		Unit4 unit = hc.getMarine();
		unit.move();
	}

}
