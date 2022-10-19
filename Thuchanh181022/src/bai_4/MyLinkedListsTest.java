package bai_4;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListsTest {
    public static void main(String[] args) {
        MyLinkedLists<Integer> str = new MyLinkedLists<Integer>();
        str.addLast(1);
        str.addLast(2);
        str.addLast(3);
        str.addLast(4);
        str.addLast(5);

        MyLinkedLists<Integer> str1 = str.clone();
        str1.printList();
    }
}