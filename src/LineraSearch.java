import java.util.ArrayList;

// Liner search using the Recursion -->

public class LineraSearch {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 13, 12, 42};
        int target = 42;
        ArrayList<Integer> list=new ArrayList<>();
        Search(a, target, 0);
        System.out.println(Search1(a,target,0));
        System.out.println(Search2(a,target,a.length-1));
        System.out.println(Search3(a,target,0,list));

        System.out.println(Search4(a,target,0));

        System.out.println(Search1(a,target,0));

    }

    static void Search(int[] a, int target, int index) {

        if (target == a[index]) {
            System.out.println("Target found: " + a[index] + " at--> [" + index + "]");
        } else {
            if (target != index) {
                Search(a, target, index + 1);
            } else {
                System.out.println("target not found");
            }

        }

    }
    static int Search1(int [] a,int target,int index){
        if(index==a.length){
            return -1;
        }
        if(a[index]==target){
            return index;
        }else {
            return Search1(a,target,index+1);
        }
    }

    //Search from the last index then-->
    static int Search2(int [] a,int target,int index){
        if(index==a.length){
            return -1;
        }
        if(a[index]==target){
            return index;
        }else {
            return Search1(a,target,index-1);
        }
    }

    //note if there are multiple occurrence then we will get different results depending upon the searching methods form the last or the first index-->
   //To get the both the occurrence we will create arraylist to store the result -->

    //this is the optimised way so use this one -->
    static ArrayList<Integer> Search3(int [] a, int target, int index, ArrayList<Integer> list){
      if(index==a.length){
          return list;
      }
      if(a[index]==target){
          list.add(index);
      }
     return Search3(a,target,index+1,list);
    }

    //not very optimised way but as list is created again and again -->
    static ArrayList<Integer> Search4(int [] a,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==a.length){
            return list;
        }
        if(a[index]==target){
            list.add(index);
        }
        ArrayList<Integer> AnsFromBelow = Search4(a,target,index+1);
        list.addAll(AnsFromBelow);
        return list;

    }

}
