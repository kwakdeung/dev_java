import java.util.Arrays;

// 배열에 210, 19, 72, 129, 34  순서대로 데이터를 입력하고
// 데이터를 정렬하시오
public class Q09 
{

	public static void main(String[] args) 
	{
		int[] arr = {210, 19, 72, 129, 34};
		Arrays.sort(arr);
		for(int e: arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
