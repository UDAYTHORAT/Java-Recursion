public class Rotated_binary_Search {
    //using the recursion-->

    public static void main(String[] args) {
         int [] a={5,6,1,2,3,4};
        int target=5;
      System.out.println(BinarySearch(a,target,0,a.length-1));

//        int p=Pivot(a,target);
//        System.out.println(p);
    }
    static int  BinarySearch(int [] a,int target,int start,int end){
        if(start>end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(a[mid]==target){
            return mid;
        }
        if(a[start]<=a[mid]) {
            if (target < a[mid] && target >= a[start]) {
                return BinarySearch(a, target, start, mid - 1);
            } else {
                return BinarySearch(a, target, mid + 1, end);
            }
        }
            if(target>a[mid] && target<=a[end]){
                return BinarySearch(a,target,mid+1,end);
            }else {
                return BinarySearch(a,target,start,mid-1);
            }
        }
//        traditional binary search is as follows-->
//
//  static  int Search(int[] a,int target,int start,int end){
//
//        while (start<=end) {
//            int mid = start + (end - start) / 2;
//            if (a[mid] == target) {
//                return mid;
//            } else if (target > a[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//    //find the pivot-->
//    static int Pivot(int [] a,int target ){
//        int s=0;
//        int e=a.length-1;
//        int mid;
//        int pivot=-1;
//        while (s<=e){
//            mid=s+(e-s)/2;
//
//            if(mid>s && a[mid]<a[mid-1]){
//                pivot=mid-1;
//            } else if (mid<a.length-1 && a[mid]>a[mid+1] ) {
//                pivot=mid;
//            }
//            if(a[s]>=a[mid]){
//                e=mid-1;
//            }else {
//                s=mid+1;
//            }
//        }
//        if(pivot==-1){
//            return Search(a,target,0,a.length-1);
//        }
//        if(target==a[pivot]){
//            return pivot;
//        } else if (target>=a[0]) {
//         return    Search(a,target,0,pivot-1);
//        }
//        else {
//            return Search(a,target,pivot+1,a.length-1);
//        }
//
//    }
//

    }

