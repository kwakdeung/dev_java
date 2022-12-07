package kr.co.study.unit;

import kr.co.study.util.Greeting;

public class Marine extends Unit implements Greeting
{
	void doMove()
	{
		System.out.println("마린이 이동합니다.");
	}
	
	public void sayHello()
	{
		System.out.println("안녕 난 마린이야");
	}
}
