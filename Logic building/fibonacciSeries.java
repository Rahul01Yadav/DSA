import java.util.Scanner;

public class fibonacciSeries {
    public static void fiboseries(int n) {
        int a = 0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            c = a+b;
            a = b;
            b = c;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        
        System.out.print("Fibonacci series : ");
        fiboseries(n);

        sc.close();
    }
}
