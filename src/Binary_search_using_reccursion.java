public class Binary_search_using_reccursion {
    public static void main(String[] args) {
        int [] a={1,2,3,4,66,77,89};
        int target=3;
        System.out.println(Search(a,target,0,a.length-1));
    }
    static int Search(int [] a,int target,int start,int end){
        if(start>end){
            return -1;
        }
         int mid=start+(end-start)/2;
         if(a[mid]==target) {
             return mid;
         }
         if(target<a[mid]){
             return Search(a,target,0,mid-1);
         }
         else {
             return Search(a, target, mid + 1, end);
         }
    }
}
