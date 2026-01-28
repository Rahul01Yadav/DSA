import java.util.Scanner;

class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = sumOfAllDigits(a);
        System.out.println(sum);
    }

    static int sumOfAllDigits(int a) {
        int sum = 0;

        a = Math.abs(a); 

        while (a > 0) {
            int lastDigit = a % 10;
            sum = sum + lastDigit;
            a = a / 10; 
        }

        return sum;
    }
}
