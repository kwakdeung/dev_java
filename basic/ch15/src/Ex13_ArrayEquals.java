import java.util.Arrays;

public class Ex13_ArrayEquals // 객체 안의 내용이 (같은지 다른지) 비교
{
	public static void main(String[] args) 
	{
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		boolean bCheck = Arrays.equals(arr1, arr2);
		System.out.println(bCheck);
	}
}
