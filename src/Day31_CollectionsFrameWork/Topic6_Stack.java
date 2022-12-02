package Day31_CollectionsFrameWork;

import java.util.Stack;

public class Topic6_Stack {
    public static void main(String[] args) {
        Stack<String> MyStack = new Stack<>();

        //push()method
        //to add an element on top of the stack
        MyStack.push("Dog");
        MyStack.push("Horse");
        MyStack.push("Cat");

        System.out.println(MyStack);

        //peek() method
        //returns the element from the top of the stack
        String myPeek = MyStack.peek();
        System.out.println(myPeek);

        //pop() method
        //removing  the element (the element on top of the stack)
        System.out.println("***********************");
        //access and remove the element
        String MyProp = MyStack.pop();
        System.out.println(MyProp);
        System.out.println(MyStack);

        //search() method

        int position = MyStack.search("Horse");
        System.out.println(position);
        System.out.println("*****************************");
        int position2 = MyStack.search("Monkey");
        System.out.println(position2);
    }
}
