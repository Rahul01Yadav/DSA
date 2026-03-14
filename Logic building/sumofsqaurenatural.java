import java.util.Scanner;

public class sumofsqaurenatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int squaresum=0;

        for(int i=1;i<=n;i++){
           squaresum += i*i;
        }

        System.out.print(squaresum);

    }
}


