//
//	Michael Tong
//	
//
//
//
//
//


public class main
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World"); 
		
		char[] str = new char[20];
		char[] newstr = new char[20];


		str = "Hello World!";
		newstr = ""; 

		int beg = 0;
		int end = str.length()-1; 

		for (int i = 0; i < end/2; i++) 

		{
			
			newstr[i] = str[end]; 
			newstr[end] = str[i]; 
			end--;
		}

		System.out.println("%d", newstr); 
		


	}

}
