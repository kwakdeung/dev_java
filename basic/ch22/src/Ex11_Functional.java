// @FunctionalInterface 어노테이션 - 여러 개의 메서드를 선언하면 에러남
// 함수형 인터페이스, 람다식을 선언하기 위한 인터페이스
@FunctionalInterface
interface Unit11
{
	String move();
	// void attack - 여러 개의 메서드 선언으로 에러남
}
public class Ex11_Functional 
{

	public static void main(String[] args) 
	{
		Unit11 unit = () -> {
			return "인간형 유닛 이동";
		};
		System.out.println(unit.move());
	}
}
