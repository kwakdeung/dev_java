class BoxA6 { }

public class Ex06_ArrayInit 
{
	public static void main(String[] args) 
	{
		int[] arr1 = new int[3];			// 0으로 초기화 - 왜? {} 값X
		int[] arr2 = new int[] {1, 2, 3};
		double[] arr3 = {1.0, 2.0, 3.0};
		double[] arr4 = new double[3];		// 0.0으로 초기화-왜? {} 값X
		BoxA6[] arr5 = new BoxA6[3];		// null - 왜?
		
		for (int i=0; i<arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
			System.out.print(arr2[i] + " ");
			System.out.print(arr3[i] + " ");
			System.out.print(arr4[i] + " ");
			System.out.print(arr5[i] + " ");
			System.out.println();			
		}
	}
}
