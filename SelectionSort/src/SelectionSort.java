/*
 * selection sort 
 */

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[] {8,4,3,9,7};

		array = sort(array);
		for(int i =0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
			//System.out.print(sort(array));
		}
	}

	public static int[] sort(int[] array)
	{
		int minimum = 0;
		int temp = 0;
		int currentElement = 0;
		int nextElement = 0;
		
		//find the minimum value from array
		for(int i = 0; i < array.length; i++ )
		{
			minimum = i;
			
			//currentElement = array[i];
			for(int j = i; j < array.length-1; j++ )
			{
				currentElement = array[minimum];
				nextElement = array[j+1];
				
				//find minimum
				if(currentElement > nextElement)
				{
					minimum = j+1;
				}
			}
			temp = array[minimum];
			array[minimum] = array[i]; 
			array[i] = temp;
			
		}
		
		return array;
	}
	
	
}
