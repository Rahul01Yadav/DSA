import java.util.ArrayList;
import java.util.Scanner;

// class multiplications_table {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int i = sc.nextInt();
//         for (int j = 1; j <= 10; j++) {
//             System.out.print(i + "*" + j + "=" + i * j);
//             System.out.println(" ");
//         }
//     }
// }


//by using ArrayList 
class multiplications_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 1; j <= 10; j++) {
            list.add(i*j);
        }

        System.out.println(list);
    }
}
