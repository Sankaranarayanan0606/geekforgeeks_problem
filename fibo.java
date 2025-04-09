public class fibo {

    public static void main(String[] args) {
        
        System.out.println(fib(50, 0, 1));
    }

    public static long fib(long n, long a, long b)
    {
        if(n == 0) return a;
        if (n == 1) return b;
        return fib(n -1 , b, a+b);
    }
}
