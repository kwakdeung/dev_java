class Npc
{
	String name;
	int hp;
	int mp;
	
	void say()
	{
		System.out.printf("안녕하세요. %s입니다. 제 hp는 %d 입니다.\n", name, hp);
	}
	
	void angry()
	{
		System.out.println("건들지 마!!!");
	}
	int 계산(int num)
	{
		int result = num - 10;
		System.out.printf("%d를 받았습니다. 반환금은 %d입니다.\n", num, result);
		return result;
	}
}

class 탈것
{
	String 이름;
	int 속력;
	
	void 달리기()
	{
		if (속력 > 50)
		{
			System.out.printf("%s(은)는 빠르게 달립니다.", 이름);
		}
		else
		{
			System.out.println("너무 느려요 ㅜㅜ");
		}
	}
}

public class MyWorld
{

	public static void main(String[] args)
	{
		Npc 여관주인 = new Npc();
		여관주인.name = "여관주인";
		여관주인.hp = 10;
		여관주인.mp = 0;
		여관주인.say();
		
		Npc 경비병 = new Npc();
		경비병.name = "경비병";
		경비병.hp = 50;
		경비병.mp = 0;
		경비병.angry();
		
		Npc 상점주인 = new Npc();
		int num = 상점주인.계산(50);
		System.out.println(num);
		
		탈것 말 = new 탈것();
		말.이름 = "적토마";
		말.속력 = 100;
		말.달리기();
		
	}

}
