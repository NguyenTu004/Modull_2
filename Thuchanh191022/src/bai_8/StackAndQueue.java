package bai_8;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {
        String text = "able was I ere I saw elba";
        String[] arr = text.split("");
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new ArrayDeque<>();
        add(arr, stack, queue);
        System.out.println(compare(arr, stack, queue));
    }

    private static void add(String[] arr, Stack<String> stack, Queue<String> queue) {
        for (String s : arr) {
            queue.offer(s);
            stack.add(s);
        }
        System.out.println(stack);
        System.out.println(queue);
    }

    private static boolean compare(String[] arr, Stack<String> stack, Queue<String> queue) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            flag = stack.pop().equals(queue.remove());
        }
        return flag;
    }
}
