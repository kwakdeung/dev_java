abstract class Calc
{
	int a = 5;
	int b = 6;
	
	abstract void Plus();
}

class MyCalc extends Calc
{
	void Plus()	 {System.out.println(a + b);}
	void Minus() {System.out.println(a - b);}
}

public class Ex01_Polymorphism1 
{

	public static void main(String[] args) 
	{
		MyCalc myCalc1 = new MyCalc();
		myCalc1.Plus();
		myCalc1.Minus();
		
		// 하위 클래스 객체를 상위 클래스 객체에 대입
		Calc myCalc2 = new MyCalc();
		myCalc2.Plus();
		// 다음 메서드는 설계도에 없다. 사용할 수 없다.
		// myCalc2.Minus();

	}

}
