package DSA_ASS_5;

public class Stack {
    package Stack.java;

    public class newStack {

        final int size=5;
        int[]s=new int[size];
        int top=-1;


        int push (int data) {
            if(top>=size-1) {
                System.out.println("stack is overflow");
                return -1;
            }
            else {
                top++;
                s[top]=data;
                return s[top];
            }
        }


        int pop() {
            if(top<=-1) {
                System.out.println("stack is UNDERFLOW");
                return -1;

            }else {

                int temp=s[top];
                top--;
                return temp;

            }



        }
        int peek() {
            if(top==-1) {
                System.out.println("stack is empty");
                return -1;
            }
            else {
                return	s[top];
            }
        }

        boolean isEmpty() {


            return top<=-1?true:false;

        }

        void display() {

            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            else {
                for (int i = 0; i <= top; i++) {
                    System.out.println(s[i]);
                }
            }
}
