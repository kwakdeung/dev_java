public class Q02
{

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
	
		// 세 개의 정수를 인자로 전달 받아서
		// 그중 가장 큰 수를
		// 반환하는 함수를 정의하라
		
		int nMax = getMax(90, 80, 100);
		System.out.println(nMax);
	}	
		
	
	public static int getMax(int n1, int n2, int n3)	
	{
		int result = 0;
		
		if (n1 > n2)
		{
			result = n1;
		}	
		else
		{
			result = n2;
		}
		
		if (n1 > n2)
		{
			
		}	
		
		if (result < n3)
		{
			result = n3;
		}
		
		return result;
// 간단한 방법
//		int result = n1;
//		if result = n2;
//		{
//			result = n2;
//		}
//		if result = n3;
//		{
//			result = n3;
//		}
//		return result;
	}

}
