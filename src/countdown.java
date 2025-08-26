import com.sun.security.jgss.GSSUtil;

public class countdown {
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int sum=0;

//        PrintSum(i,n,sum);
//       int a= Factorial(5);
//        System.out.println(a);

//        for (int j = 0; j <6 ; j++) {
//            System.out.println(fibo(j));
//        }
        System.out.println(power(2,5));
        System.out.print("Log(n)-->");
        System.out.println(powerLogn(2,5));

    }
    static void PrintSum(int i,int n,int sum){
        if(i==n){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum+=i;
        PrintSum(i+1,n,sum);
    }
    static int Factorial(int n){
        int sum=1;
        if(n!=0){
            sum= n*Factorial(n-1);
        }
    return sum;
    }

    static int  fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }


    //A^B and the stack height = B
    static int power(int base,int power){

        if(base==0){
            return 0;
        }
        if(power==0){
            return 1;
        }
        int Calpow= power(base,power-1);
        System.out.println("calpow val ["+Calpow+"]*"+base+" "+base+"^"+power+"->"+base*Calpow);
        return base*Calpow;

    }

    //now A^B and the stack height = log(B)-->memory consume is reduced;
    static int powerLogn(int base,int power){

        if(base==0){
            return 0;
        }
        if(power==0){
            return 1;
        }
        int half = powerLogn(base,power/2);
        if(power%2==0){
            return half*half;
        }else {
             return half* half * base;
        }
    }
    /*
    Great question 🔥 Let’s break it down for **both versions** (the normal recursive power and the optimized divide-by-2 recursion).

---

# 1️⃣ Normal recursion (`power(base, pow-1)`)

```java
int Calpow = power(base, pow-1);
return base * Calpow;
```

### Time Complexity

* Each call decreases `pow` by 1.
* So it makes **n recursive calls**.
* ⏱ **Time = O(n)**

### Space Complexity

* Each recursive call is stored in the **call stack** until it returns.
* Depth of recursion = `n`.
* 💾 **Space = O(n)**

---

# 2️⃣ Optimized recursion (Divide & Conquer, `powerLogn`)

```java
int half = powerLogn(base, pow/2);
if (pow % 2 == 0) return half * half;
else return half * half * base;
```

### Time Complexity

* Each call halves `pow`.
* Total number of calls ≈ log₂(n).
* ⏱ **Time = O(log n)**

### Space Complexity

* Maximum depth of recursion = log₂(n).
* So stack stores about `log n` calls at most.
* 💾 **Space = O(log n)**

---

# 🔥 Summary Table

| Method                        | Time Complexity | Space Complexity |
| ----------------------------- | --------------- | ---------------- |
| Normal recursion (`pow-1`)    | O(n)            | O(n)             |
| Optimized recursion (`pow/2`) | O(log n)        | O(log n)         |

---

👉 That’s why we prefer the **divide-and-conquer (log n) method** for large powers — it’s much faster and uses less memory.

---

Do you want me to also show you how **iterative version** (loop-based power) compares in time/space with these recursive ones?

     */
}
