interface Human1 {
	int MAN = 1;
	int WOMAN = 2;
}

interface Machine1 {
	int TANK = 1;
	int AIRPLANE = 2;
}


public class Ex01_Constants // 열거형이란? 연관된 상수들을 같이 모아 놓고 대표할 수 있는 이름을 정의 한 것.
{
	public static void main(String[] args) 
	{
		createUnit(Machine1.TANK);
		
		createUnit(Human1.MAN);	// 잘못된 상수 사용
	}
	
	public static void createUnit(int kind) {
		switch(kind) {
		case Machine1.TANK:
			System.out.println("탱크를 만듭니다.");
			break;
		case Machine1.AIRPLANE:
			System.out.println("비행기를 만듭니다.");	// 잘못된 상수 사용으로 탱크를 만듭니다가 결과로 뜸
			break;
		}
	}

}
