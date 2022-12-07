interface Unit5
{
	@Deprecated
	public void move(String str);
	public void run(String str);
}

class Human5 implements Unit5
{
	@Override
	public void move(String str)
	{
		System.out.println(str);
	}
	@Override
	public void run(String str)
	{
		System.out.println(str);
	}
}

public class Ex05_Deprecated //문제의 발생 소지가 있거나 개선된 기능의 다른 것으로 대체되어
							//더 이상 필요가 없게 되었음.
{
	public static void main(String[] args) 
	{
		Unit5 unit = new Human5();
		unit.move("인간형 유닛이 이동합니다.");
		unit.run("인간형 유닛이 달립니다.");
	}

}
//명령 프롬프트에서 다음과 같이 컴파일
//javac -encoding UTF-8 Ex05_Deprecated.java
