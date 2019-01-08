
public class Booth {

	public static void main(String args[])
	{
		int dividend = 3;
		System.out.println(convertToBinary(dividend));			
	}
	
	public static boolean isNegative(int dividend)
	{
		if(dividend < 0)
		{
			return true;
		}
		else 
			return false;	
	}
	
	public static boolean isPositive(int dividend)
	{
		if(dividend >= 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static String convertToBinary(int dividend)
	{
		boolean isNegativeNumber = isNegative(dividend);
		
		int divisor = 2;
		int quotient = dividend;
		int remainder = 0;
		String s = "";
		String s2 = "";
		String fourBits = "";

		if( dividend < 0) //if dividend is negative
		{
			dividend = dividend * -1; //change dividend to positive
		}
		
		while(quotient != 0)
		{
			remainder = dividend % divisor;
			quotient = dividend / divisor;
			s = s + Integer.toString(remainder);
			
			dividend = quotient;
			
		}
		for(int i=s.length()-1; i >= 0; i--)	
		{
			s2 = s2 + s.charAt(i);
		}

		if (s2.length() < 4 )	//read 8 bits
		{
			for(int i=0; i< (4-s2.length()); i++ )
			{
				fourBits = fourBits + "0";
			}
			fourBits = fourBits + s2;
		}
		else 
		{
			fourBits = fourBits + s2;
		}
		
		String invertBinary = "";
		String plus = "";
		if(isNegativeNumber)
		{
			// Invert four bit 
			for(int i =0; i < fourBits.length(); i++)
			{
				char c  = fourBits.charAt(i);
				
				if(c == '0')
				{
					invertBinary = invertBinary + '1';
				}
				else if(c == '1')
				{
					invertBinary = invertBinary + '0';				
				}
			}
			for(int i = invertBinary.length()-1 ; i >= 0; i--)
			{		
				char c = invertBinary.charAt(i);
				
				
			}	

			fourBits = invertBinary;
		}
		
		
		return fourBits;
				
	
	}
}
