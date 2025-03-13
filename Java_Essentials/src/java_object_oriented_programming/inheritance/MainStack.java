package java_object_oriented_programming.inheritance;

import java.util.Stack;

public class MainStack
{
    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();

        charStack.push('c'); //* tail of the stack
        charStack.push('a');
        charStack.push('t'); //* head of the stack

        System.out.println(charStack.pop());//* output: t
        System.out.println(charStack.pop());//* output: a
        System.out.println(charStack.pop());//* output: c
    }
}
