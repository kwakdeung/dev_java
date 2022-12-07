interface Unit7
{
	void move(String s);	// 매개변수
}

public class Ex07_Lambda3 
{
	public static void main(String[] args)
	{
		Unit7 unit = (String s) ->	// 매개변수
			{
				System.out.println(s);	// 함수몸체
			};
		unit.move("Lambda : Unit 7");

	}

}
