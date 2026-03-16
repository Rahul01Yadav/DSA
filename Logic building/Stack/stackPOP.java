public class stackPOP {
    static int stack[] = {1,2,3,4,5};
    static int top = stack.length-1;
    public static void main(String[] args) {
        if(top == -1){
            System.out.println("stack underflow");
        }else{
            int x = stack[top];
            top = top-1;
            System.out.println(x+" is popped from the stack");
        }
    }
}
