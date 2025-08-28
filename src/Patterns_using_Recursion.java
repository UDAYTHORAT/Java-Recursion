import java.util.regex.Pattern;

public class Patterns_using_Recursion
{
	public static void main(String[] args)
<<<<<<< HEAD
		{
	Pattern(5,0);
	Pattern1(5,0);

}
//
//      ****
//		***
//		**
//		*
	static void Pattern(int n,int count){
		if(n==0){
			return;
		}
		if(count<n){
			System.out.print("*");
			Pattern(n,count+1);
		}else {
			System.out.println();
			Pattern(n-1,0);
		}

	}

	static void Pattern1(int n,int c){
		if(n==0){
			return;
		}
		if(c<n){
			Pattern1(n,c+1);
			System.out.print("*");

		}else {
			Pattern1(n-1,0);
			System.out.println();

		}
	}


=======

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

>>>>>>> 791f1d4bb68bd3b3055fd17c6b2956ceae4a8e50
}
