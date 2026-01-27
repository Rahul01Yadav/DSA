import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        List<Integer> result = new ArrayList<>();

        result.add(a);
        result.add(b);

        System.out.println(result);

    }
}
