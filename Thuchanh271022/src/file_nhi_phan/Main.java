package file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void write(String path, List<Product> list){
        try {
            FileOutputStream out = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
            oos.close();
            out.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static List<Product> read(String path){
        List<Product> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = ((List<Product>) ois.readObject());
            fis.close();
            ois.close();
        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Product> list = read("C:\\Users\\ASUS\\Desktop\\Máy tính\\Modull_2\\Thuchanh271022\\src\\file_nhi_phan\\product.csv");
//        list.add(new Product(3,"hang4","ABC",32,"C"));
//        list.add(new Product(1,"hang1","ABC",32,"A"));
//        list.add(new Product(2,"hang2","DEF",32,"B"));
//        list.add(new Product(10,"hang2","DEF",32,"1B"));
        list.add(new Product(999,"hang09999","DEF",32,"dwsgw"));
//        for (Product list2 : list) {
//            System.out.println(list2);
//        }
        write("C:\\Users\\ASUS\\Desktop\\Máy tính\\Modull_2\\Thuchanh271022\\src\\file_nhi_phan\\product.csv", list);
        List<Product> lists = read("C:\\Users\\ASUS\\Desktop\\Máy tính\\Modull_2\\Thuchanh271022\\src\\file_nhi_phan\\product.csv");
        for (Product list1 : lists) {
            System.out.println(list1);
        }
    }
}
