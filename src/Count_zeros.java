public class Count_zeros {
    public static void main(String[] args) {
        int n=10;
        Count(n);
        int k=Count1(n);
        System.out.println(k);

        int s= Count2(n,0);
        System.out.println(s);
    }
    static int count=0;
    static void Count(int n){
        if(n%10==n){
            System.out.println(count);
            return;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
        Count(n/10);
    }

    //Counting zeros  -->
    static int Count1(int n){
        if(n==0){
            return 0;
        }
        if(n<10){
            return n%10==0 ?1:0;
        }
        int rem=n%10;
         if(rem==0){
             return 1+Count1(n/10);
         }else {
             return Count1(n/10);
         }
    }
    //one more way-->
    static int Count2(int n,int count){

        if(n==0){
            return count;
        }
        if(n%10==0){
           return Count2(n/10,1+count);
        }else {
           return Count2(n/10,count);
        }


    }
}
