package bai_3;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stacks ;
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stacks  = reverse(stack);
        System.out.println(stacks.get(1));


    }
    public static Stack<Integer> reverse(Stack<Integer> stack){
        final int SIZE  = stack.size();
        Stack<Integer> stacks =  new Stack<Integer>();
        for(int i =0;i<SIZE;i++){
            stacks.push(stack.pop());
        }
        for (int i = 0; i < stacks.size(); i++) {
            System.out.print(stacks.get(i)+" ");
        }
        return stacks;

    }

}