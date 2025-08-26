public class Easy {
    public static void main(String[] args) {
        int n=5;
//        RevNo(n);
     //   No(n);

//        FunBoth(n);
        System.out.println(Product(3));
        System.out.println(Sum(4));
        System.out.println(SumOfDigits(4610));
        System.out.println(ProductOfDigits(1232));


    }
    static void RevNo(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
          RevNo(n-1);
    }

    static void No(int n){
        if(n==0){
            return;
        }
        No(n-1);
        System.out.println(n);

    }

    static void FunBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        FunBoth(n-1);
        System.out.println(n);

    }
    static int Product(int n){
        int sum=1;
        if(n!=0){
            sum=n* Product(n-1);
        }
        return sum;
    }
    static int Sum(int n){
        int sum=0;
        if(n!=0){
            sum=n+Sum(n-1);
        }
        return sum;
    }

    static int SumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+SumOfDigits(n/10);
    }

    static int ProductOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)+ProductOfDigits(n/10);
    }
}
