import java.util.Arrays;

public class Bubble_sort
{
	public static void main(String[] args)
	{
		int [] a={5,3,2,1,4};
		Bubblesort(a,a.length-1 ,0);
		System.out.println(Arrays.toString(a));
	}
	static void Swap(int [] arr, int a){
		if(arr[a]>arr[a+1]){
			int temp= arr[a];
			arr[a]=arr[a+1];
			arr[a+1]=temp;

		}
	}
	//li = last index in unsorted array
	//ci= current  limit after the single pass
	static void Bubblesort(int [] a, int li, int ci){
		if(li==0){
			return;
		}
		if(li> ci){
			if(a[ci]>a[ci +1]){
				Swap(a, ci);
			}
			Bubblesort(a,li, ci +1);
		}else {
			Bubblesort(a,li-1,0);
		}
	}


	}


