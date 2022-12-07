//클래스 전부가 아닌 메소드 하나에 대해 제네릭으로 정의
//제네릭 메서드의 T는 메서드 호출 시점에 결정한다.
//제네릭은 클래스 뿐만 아니라 메서드로도 사용 가능
class MyData
{
	public static <T> T showData(T data)
	{
		if (data instanceof String)
			System.out.println("String");
		else if (data instanceof Integer)
			System.out.println("Integer");
		else if (data instanceof Double)
			System.out.println("Double");
		
		return data;
	}
}
public class Ex09_GenericMethod 
{

	public static void main(String[] args) 
	{
		MyData.<String>showData("Hello World"); //제네릭<String>은 메서드로도 사용가능
		MyData.showData(1);		//<int> 생략
		MyData.showData(1.0);	//<double> 생략

	}

}
