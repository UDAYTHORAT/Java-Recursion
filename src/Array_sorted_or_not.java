public class Array_sorted_or_not {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,9};
       boolean k=  Check(a,0);
        System.out.println(k);

    }
    static boolean Check(int [] a,int index){
        if(a.length-1==index){
            return true;
        }
        if(a[index]<a[index+1]){
            return Check(a,index+1);
        }else {
            return false;
        }

    }
}
