import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		//int nNum = this.name.compareTo(p.name);
		//return nNum;
		
		if(this.age > p.age)		// 나이 내림차순
			return 1;
		else if(this.age < p.age)
			return -1;
		else
			return 0;
	}
	
	public String toString() {
		return name + ": " + age;
	}
	
}

public class Ex17_ArrayObjSort // compareTo(추상) 메서드 정의 기준, 나이 내림차순
{

	public static void main(String[] args) 
	{
		Person[] arr = new Person[3];
		
		arr[0] = new Person("홍길동", 29);
		arr[1] = new Person("전우치", 15);
		arr[2] = new Person("손오공", 37);
		
		Arrays.sort(arr);
		
		for(Person p : arr)
			System.out.println(p);
	}
}
