interface Unit6
{
	void move(String s);	// 매개변수
}

public class Ex06_Lambda2 
{

	public static void main(String[] args)
	{
		Unit6 unit = new Unit6() {	// 익명 클래스
			public void move(String s)
			{
				System.out.println(s);	// 함수몸체
			}
		}; // 하나의 실행문이므로 세미콜론으로 끝납니다.
		unit.move("Lambda : Unit 6");

	}

}
