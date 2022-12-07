class Unit
{
	
}

class 사람 extends Unit
{
	void say() { };
	void move() { };
}

class 상인 extends 사람
{
	void 거래() { };
}

abstract class 군인 extends 사람
{
	abstract void 공격();
	abstract void 방어();
}

interface 하늘날기
{
	void 허공답보();
}

interface 식량조달
{
	void 낚시();
}

class 위나라군인 extends 군인 implements 하늘날기, 식량조달
{
	void 공격() { };
	void 방어() { };
	void 활쏘기() { };
	public void 허공답보() { };
	public void 낚시() { };
}

class 촉나라군인 extends 군인
{
	void 공격() { };
	void 방어() { };
	void 마상공격() { };
}

class 오나라군인 extends 군인
{
	void 공격() { };
	void 방어() { };
	void 칼싸움() { };
}

public class MyWorld2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
