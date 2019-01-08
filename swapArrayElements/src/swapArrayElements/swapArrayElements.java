package swapArrayElements;

import java.util.Arrays;

public class swapArrayElements {

	public static void main(String[] args) 
	{
		int index0 = 0;
		int index1 = 1;
		int[] array = {56,78};
		
//		swap1(array, index0, index1);
//		swap2(array, index0, index1);
		swap3(array, index0, index1);
		
		System.out.println(Arrays.toString(array));
	}

	//one way to swap - using temp
	public static int[] swap1(int[] array, int index0, int index1)
	{
		int temp;
		temp = array[index0];
		array[index0] = array[index1];
		array[index1] = temp;
		
		return array;
	}

	//another way to swap - using addition and subtraction
	public static int[] swap2(int[] array, int index0, int index1)
	{
		//			 a = 10, b = 20
		//a = a + b; a = 30, b = 20
		//b = a - b; a = 30, b = 10
		//a = a - b; a = 20, b = 10	
		 
		array[index0] = array[index0] + array[index1];
		array[index1] = array[index0] - array[index1];
		array[index0] = array[index0] - array[index1];
		
		return array;
	}
	
	//another way to swap - using multiplication and division	
	public static int[] swap3(int[] array, int index0, int index1)
	{
		//			 a = 10,  b = 20
		//a = a * b; a = 200, b = 20
		//b = a / b; a = 200, b = 10
		//a = a / b; a = 20,  b = 10	
		 
		array[index0] = array[index0] * array[index1];
		array[index1] = array[index0] / array[index1];
		array[index0] = array[index0] / array[index1];
		
		return array;
	}
	
}
