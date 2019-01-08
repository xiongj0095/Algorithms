/*
 * Sort alphabet in ascending order
 */

public class SortAlphabet {

	public static void main(String[] args) {
		
		String[] words = new String[] {"He", "Bye", "Hello", "Later"};
		int[] num = new int[]{2,1,3,1};
		
	//	System.out.println(alphabetValue('p'));
/*		num = bubbleSort(num);
		for(int i=0; i<num.length;i++)
		{
			System.out.print(num[i]);
		}
*/
		words = sort(words);		
		for(int i=0; i<words.length;i++)
		{
			System.out.print(words[i] + " ");
		}
	}

	//assign letter to a value
	public static int alphabetValue(char c)
	{
		return (int) Character.toUpperCase(c)-64;
	}
	
	//sort letters
	public static String [] sort(String[] words)
	{	
		boolean flag = true;
		int lengthOfWords = 0;
		String temp = "";
		
		while(flag)
		{
			for(int i = 0; i < words.length-1; i++)
			{
				flag = false;
				// Take first letter of current index and next index and compare them.
				// Compare the size of them first.
	
				if(words[i].length() <= words[i+1].length())
				{
					lengthOfWords = words[i].length();
				}else
				{
					lengthOfWords = words[i+1].length();
				}
				
				for(int j = 0; j < lengthOfWords; j++)
				{
					
					if(alphabetValue(words[i].charAt(j)) > alphabetValue(words[i+1].charAt(j)))
					{
						// Swap
						temp = words[i];
						words[i] = words[i+1];
						words[i+1] = temp;
						
						flag = true;
						break;
					}
					break;
				}
				
			}
		}
		
		return words;
	}

	//sort
	public static int[] bubbleSort(int[] num)
	{
		int current = 0; 
		int nextNumber = 0;  
		int temp;
		
		for(int j = 0; j < num.length-1;j++ )
		{
			for(int i=0; i < num.length-1; i++)
			{
				current = num[i];
				nextNumber = num[i+1];
				if(current > nextNumber)
				{
					temp = nextNumber;
					num[i+1] = current;
					num[i] = temp;
					
				}
			}
		}
		
		return num;
	}
}
