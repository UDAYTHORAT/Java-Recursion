import java.util.Arrays;

public class Selection_sort
{
	public static void main(String[] args)
	{
		int [] a={5,6,3,2,1,4};
		SelectionSort(a,0,a.length,0);
		System.out.println(Arrays.toString(a));
	}
	static void SelectionSort(int [] a,int ci,int li,int max)
	{
      if(li==0)return;
	  if(ci<li){
		  if(a[ci]>a[max]){
			  SelectionSort(a,ci+1,li,ci);
		  }else {
			  SelectionSort(a,ci+1,li,max);
		  }
	  }else {
		  int temp=a[max];
		  a[max]=a[li-1];
		  a[li-1]=temp;
		  SelectionSort(a,0,li-1,0);
	  }
	}
}
