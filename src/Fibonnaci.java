public class Fibonnaci {
    public static void main(String[] args) {

        int ans = fibo(6);
        System.out.println(ans);
        find(6);

    }

    static int fibo(int n) {

        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);

    }
    static void find(int n){

        long start=0;
        long end=1;
        long result=0;

        for (int i = 1; i < n ; i++) {
           result=start+end;
          start=end;
          end=result;

        }
        System.out.println(result);

    }
}
