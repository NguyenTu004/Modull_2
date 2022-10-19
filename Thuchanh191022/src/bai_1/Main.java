package bai_1;

import java.util.LinkedList;

import static bai_1.Manager.stackOfStrings;
import static bai_1.Manager.stackOfIntegers;

public class Main {
    public static void main(String[] args) {
//        stackOfStrings();
//        stackOfIntegers();
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);
        stack.pop();
        System.out.println(stack);
    }
}
