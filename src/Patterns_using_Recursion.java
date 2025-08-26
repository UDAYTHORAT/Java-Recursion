import java.util.regex.Pattern;

public class Patterns_using_Recursion
{
	public static void main(String[] args)

		{
//		for (int i = 0; i <4 ; i++)
//		{
//			for (int j = 4-i; j >0 ; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	Pattern(4,0);

}

	static void Pattern(int n,int count){


		   if(n!=0)
		   {
			   if (count != n)
			   {
				   Pattern(n,count+1);
				   System.out.print("*");
				   Pattern(n-1,count);
			   }
			   System.out.println();


		   }






	}

}
