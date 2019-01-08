import java.util.Arrays;

/*
 * Merge Sort -
 * 
 */

public class MergeSort {

	public static void main(String[] args)
	{
		int[] array = {38, 27, 43, 3, 9, 82, 10};
		int lowIndex = 0;
		int highIndex = array.length-1;
		
		mergeSort(array,lowIndex, highIndex); 

		System.out.println(Arrays.toString(array));
	
	}
	
	public static void mergeSort(int[] array, int lowIndex, int highIndex)
	{
		if(lowIndex == highIndex)
		{
			return;
		}
		
		int midIndex = (lowIndex + highIndex) / 2;
		
		// Merge sorting the left side - dividing the left side recursively
		mergeSort(array,lowIndex,midIndex);
		
		// Merge sorting the right side - dividing the right side recursively
		mergeSort(array,midIndex+1,highIndex);
		
		// Merge both sides
		merge(array,lowIndex, midIndex, highIndex);
	}
	
	public static void merge(int[] array, int lowIndex, int midIndex, int highIndex)
	{
		//new arrays
		int[] lowHalf = new int[midIndex-lowIndex+1];
		int[] highHalf = new int[highIndex - midIndex];
		
		int lowHalfIndex = 0;
		int highHalfIndex = 0;
		
		//copy array elements to temp arrays elements
		for(int i=lowIndex; i <= midIndex; i++)
		{
			if(lowHalfIndex == lowHalf.length)
			{
				break;
			}
			
			lowHalf[lowHalfIndex] = array[i];
			
			lowHalfIndex++;
		}
		
		for(int j= midIndex+1; j <= highIndex; j++)
		{
			if(highHalfIndex == highHalf.length)
			{
				break;
			}
			
			highHalf[highHalfIndex] = array[j];
			
			highHalfIndex++;
		}
		
		int i = 0;
		int j = 0;
		
		while(i != lowHalf.length && j != highHalf.length) {
			
			if(highHalf[j] < lowHalf[i]) {
				
				array[lowIndex] = highHalf[j];
				
				lowIndex++;
				
				j++;
			}
			
			if(i == lowHalf.length || j == highHalf.length) {
				break;
			}
			
			if(lowHalf[i] < highHalf[j]) {
				
				array[lowIndex] = lowHalf[i];
				
				lowIndex++;
				
				i++;
			}
		}
		
		while(i != lowHalf.length) {
			array[lowIndex] = lowHalf[i];
			lowIndex++;
			i++;
		}
		while(j != highHalf.length) {
			array[lowIndex] = highHalf[j];
			lowIndex++;
			j++;
		}
		
	}
}
