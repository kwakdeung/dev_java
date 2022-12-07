// 지역 내부 클래스
// 위치가 메서드, if문, while 문 같은 중괄호 블럭 안에 정의된다는 점에서 멤버 내부 클래스와 구분된다.
// 클래스의 정의를 깊이 숨기는 효과가 있다.- 해당 메서드 안에서만 객체 생성 가능
class HumanCamp2
{
	private int speed = 10;
	
	public void getMarine()
	{
		class Marine2
		{
			// 외부 클래스의 자원(speed) 사용 가능
			public void move()
			{
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}
		
		Marine2 inner = new Marine2();
		inner.move();
	}
}

public class Ex02_LocalInner 
{

	public static void main(String[] args)
	{
		HumanCamp2 hc = new HumanCamp2();
		hc.getMarine();
	}

}
