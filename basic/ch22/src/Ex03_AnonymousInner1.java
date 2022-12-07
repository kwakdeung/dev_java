// 익명 내부 클래스
// 클래스의 이름을 생략한 것이 익명 내부 클래스이다.(나 혼자만 사용하기 때문에)
// 람다식과도 관련이 있다.

interface Unit3
{
	void move();	
}

class HumanCamp3
{
	private int speed = 10;
	
	public Unit3 getMarine()
	{
		class Marine3 implements Unit3
		{
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}
		
		return new Marine3();
	}
}

public class Ex03_AnonymousInner1 
{

	public static void main(String[] args)
	{
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();

	}

}
