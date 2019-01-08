import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int[] orderedArray = {1, 2, 3, 5, 9};
		int[] unorderedArray = {2, 1, 5, 9 , 3};
		int elementSearch = 2;
		
		int index;
		index = binarySearch(unorderedArray, elementSearch);
		
		System.out.println("Index: " + index + " Value: " + unorderedArray[index]);
	}

	public static int binarySearch(int[] array, int elementSearch)
	{		
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		
		Arrays.sort(array);
		
		while(elementSearch != array[mid] && start <= end)
		{
			mid = (start + end) / 2;
			
			if(elementSearch == array[mid])
			{
				return mid;
			}
			else if(elementSearch > array[mid] )
			{
				start = mid + 1;
			}
			else if(elementSearch < array[mid] )
			{
				end = mid - 1;
			}
		}
		
		//unable to find element
		return -1;
	}
	
	
}
