
import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        int [] a={4,2,1,3,5};
        BubleSort(a);
        System.out.println("Bubble sort --> "+ Arrays.toString(a));
        SelectionSort(a);
        System.out.println("Selection sort --> "+Arrays.toString(a));
        InsertionSort(a);
        System.out.println("Insertion sort --> "+Arrays.toString(a));
        CycleSort(a);
        System.out.println("Cycle sort --> "+Arrays.toString(a));
    }

    static void BubleSort(int [] a){
        for (int i = 0; i <=a.length-1 ; i++)
        {
            for (int j = 0; j <=a.length-1-i ; j++)
            {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }else {
                    i++;
                }

            }
        }
    }
    static void SelectionSort(int[] a){
        for (int i = 0; i <a.length-1; i++) {
            int last = a.length - 1 - i;
            int max = 0;

            for (int j = 0; j <=a.length - 1 - i; j++)
            {
                if (a[max] < a[j]) {
                    max = j;
                }
            }
                int temp = a[last];
                a[last] = a[max];
                a[max] = temp;

            }
        }
        static void InsertionSort(int [] a){
            for (int i = 0; i <=a.length-2 ; i++)
            {
                for (int j = i+1; j <=a.length-1; j++)
                {
                    if(a[j]<a[j-1]){
                        int temp=a[j];
                        a[j]=a[j-1];
                        a[j-1]=temp;
                    }else {
                        break;
                    }
                }
            }
        }
        static void CycleSort(int [] a){
        int i=0;
        while (i<a.length-1){
            int correct= a[i]-1;

            if(a[i]!=a[correct]){
                int temp =a[i];
                a[i]=a[correct];
                a[correct]=temp;
            }else {
                i++;
            }
		}
        }
    }

