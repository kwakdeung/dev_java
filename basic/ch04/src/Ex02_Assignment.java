
public class Ex02_Assignment
{

	public static void main(String[] args)
	{
		short num = 10;
		num += 77L;					// 형 변환 필요하지 않음, 복합 대입 연산자
		System.out.println(num);
		
		num = (short)(num + 77L);	// 형 변환 필요
		System.out.println(num);

	}

}
