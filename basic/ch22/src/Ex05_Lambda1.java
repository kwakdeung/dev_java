// 람다식 - 함수형 프로그래밍
// 클래스 생성X, 함수 호출만 기능 수행
// 매서드만 이루어짐

interface Unit5
{
	void move(String s);	// 매개변수 하나, 반환형 void
}

class Human5 implements Unit5
{
	public void move(String s)
	{
		System.out.println(s);
	}
}

public class Ex05_Lambda1 
{

	public static void main(String[] args) 
	{
		Unit5 unit = new Human5();
		unit.move("Lambda : Unit 5");
	}
}
