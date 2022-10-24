package Chuoi_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        System.out.println(string.length());
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            System.out.println(list);
            list.add(string.charAt(i));
            System.out.println(string.charAt(i));
            System.out.println(list);
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}