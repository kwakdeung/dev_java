interface Unit5
{
	public void move(String str);
	public void run(String str);
}

class Human4 implements Unit4
{
	@Override
	public void move(String str)
	{
		System.out.println(str);
	}
}
public class Ex00
{
	
	public static void main(String[] args) 
	{
		Unit4 unit = new Human4();
		unit.move("인간형 유닛이 이동합니다.");
	
	}
}
