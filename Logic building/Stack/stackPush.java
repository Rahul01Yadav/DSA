import java.util.Scanner;

public class stackPush {

    static int stack[] = new int[5];
    static int top = -1;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter an element: ");
        int x = sc.nextInt();
        if(top == stack.length-1){
            System.out.println("Stack overflow");
        }else{
            top = top+1;
            stack[top] = x;
            System.out.println(x+" is pushed to stack");
        }
    }
}
