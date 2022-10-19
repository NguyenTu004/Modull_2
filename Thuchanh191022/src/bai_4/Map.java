package bai_4;

import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        String text = "programming";
        String[] arr = text.split("");
        java.util.Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.isEmpty()){
                map.put(arr[i], 1);
            }else {
                if(map.containsKey(arr[i])){
                    map.put(arr[i], map.get(arr[i]) + 1);
                }else {
                    map.put(arr[i], 1);
                }
            }
        }
        System.out.println(map);
    }
}