package sap_xep_chen;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(23);
        list.add(2);
        int pos,x;
        int size = list.size();
        for (int i = 1; i < size ; i++) {
            x = list.get(i);
            pos = i;
            while ( pos > 0 && x > list.get(pos-1)) {
                list.remove(pos);
                list.add(pos,list.get(pos-1));
                pos--;
            }
            list.remove(pos);
            list.add(pos,x);
        }
        for (Integer ch : list) {
            System.out.println(ch);
        }
    }


}
