//상속받은 클래스에서 오버라이딩으로 비교하고 싶은
//항목을 재정의해서 비교하라는 것.
// 디버그 run as 로 개념 이해하기
class Book5
{
	String author;
}
public class Ex05_equals1 
{

	public static void main(String[] args) 
	{
		Book5 myBook1 = new Book5();
		myBook1.author = "홍길동";
		
		Book5 myBook2 = new Book5();
		myBook2.author = "홍길동";
		
		if ( myBook1.equals(myBook2))
			System.out.println("두 객체의 참조 id는 같습니다.");
		else
			System.out.println("두 객체의 참조 id는 다릅니다.");

	}

}
