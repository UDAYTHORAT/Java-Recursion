public class Revers_a_number {
    public static void main(String[] args) {
        int a= 12241;
//        Reverse(a);

        int k=Reverse1(a);
        System.out.println(k);
//        System.out.println(Palindrome(a));
//
//        panlind(a);
    }

    //Reverse a number my way-->
    static int Reverse(int n){
        if(n==0){
            return 0;
        };
        System.out.print(n%10+" ");
        return  Reverse(n/10);
    }

    //1 st way to do-->

    static int  Reverse1(int n){
        int digits=(int) Math.log10(n)+1;
       return helper( n, digits);
    }
    static int helper(int n,int digits){
        int sum=0;
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        sum=rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
        return sum;
    }

    //Palindrome-->
    static boolean Palindrome(int n){
        return n==Reverse1(n);
    }

    //Using the While loop -->

    static void panlind(int n){
        int res=0;
        int rem=0;
        int k=n;
        while (n>0){
            rem=n%10;
            res=res*10+rem;
            n/=10;
        }
        System.out.println(res);
        if(k==res){
            System.out.println("its palindrome ");
        }else {
            System.out.println("its not a  palindrome");
        }
    }


}
