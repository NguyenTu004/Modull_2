package Product;

import java.util.Scanner;

import static Product.ProductManager.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Them san pham:");
            System.out.println("2.Xoa san pham:");
            System.out.println("3.Sua san pham:");
            System.out.println("4.Tim kiem san pham:");
            System.out.println("5.Sap xep san pham:");
            System.out.println("6.Hien thi san pham:");
            System.out.println("0.Thoat!!!:");
            System.out.println("Lua chon cua ban:" );
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct(scanner);break;
                case 2:
                    deleteProduct(scanner);break;
                case 3:
                    editProduct( scanner);break;
                case 4:
                    seachProduct(scanner);break;
                case 5:
                    sortedProduct(scanner);break;
                case 6:
                    display();break;
            }
        }while (choice != 0);
    }
}

