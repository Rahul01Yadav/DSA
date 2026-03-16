import java.util.Scanner;

class nthfibonacci{

    public static int fibo(int n) {

        int a = 0, b = 1, c;

        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number :");
        int n = sc.nextInt();
        
        System.out.println("Nth Fibonacci :");
        System.out.println(fibo(n));

        sc.close();
    }
}