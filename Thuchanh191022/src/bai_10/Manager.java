package bai_10;

import java.util.ArrayDeque;
import java.util.Queue;

public class Manager {
    public static String text=" ";
    public static void sort(Queue<Human> queue) {
        Queue<Human> sortNu1 = new ArrayDeque<>();
        Queue<Human> sortNu2 = new ArrayDeque<>();
        Queue<Human> sortNam1 = new ArrayDeque<>();
        Queue<Human> sortNam2 = new ArrayDeque<>();
         final int SIZE = queue.size();
         for(int i = 0; i < SIZE; i++) {
             if (queue.peek().isGender().equals("Nu")){
                 sortNu1.add(queue.remove());
             }else {
                 sortNam1.add(queue.remove());
             }
         }
         int day = queue.peek().getDate().getDayOfMonth();
        for (int i = 0; i < sortNu1.size(); i++) {
            for (int j = 0; j < sortNu1.size(); j++) {
                if (sortNu1.peek().getDate().getYear() == sortNu1.peek().getDate().getYear()) {

                }
            }
        }
    }
}
