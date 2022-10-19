package bai_1;

public class Manager {
    static void stackOfStrings(){
        MyGenericStack<String> stack = new MyGenericStack<String>();
        stack.push("Five");
        stack.push("For");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Size: "+stack.size());
        System.out.println("Pop: ");
        while(! stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n.Size of stack: "+stack.size());
    }

    static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
    }
}
