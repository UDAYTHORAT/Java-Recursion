import java.util.regex.Pattern;

public class Patterns_using_Recursion
{
	public static void main(String[] args)
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


}
