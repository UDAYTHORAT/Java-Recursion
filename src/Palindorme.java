public class Palindorme {
    public static void main(String[] args) {
        int a= 121121;
        int k= check(a);
        System.out.println(k);
        System.out.println(Palindrome(a));
        Panlindrome2(a);
    }
    static int check(int a) {
        int digits=(int)Math.log10(a)+1;
        return Helper(a,digits);
    }
    static  int Helper(int a,int digits){
        if(a%10==a){
            return a;
        }
        int sum=0;
        int rem=a%10;
        sum=rem*(int)Math.pow(10,digits-1)+Helper(a/10,digits-1);
        return sum;
    }
    static boolean Palindrome(int a){
        return a==check(a);
    }

    // Using the While loop-->

    static void Panlindrome2(int a){
        int original=a;
        int reverse=0;
        while (a>0){
            int rem=a%10;
            reverse=reverse*10+rem;
            a/=10;
        }
        if(original==reverse){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
