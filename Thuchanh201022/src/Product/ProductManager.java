package Product;

import java.util.*;



public class ProductManager {
    static List<Product> products = new ArrayList<Product>();

    public static void addProduct(Scanner scanner) {
        do {
            System.out.println("Menu Add Product");
            System.out.println("Nhap id san pham: ");
            String id = scanner.nextLine();
            System.out.println("Nhap ten san pham: ");
            String name = scanner.nextLine();
            System.out.println("Nhap gia san pham: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Ten san pham: "+name + " ;  price "+price+" ; ID: "+id);
            products.add(new Product(name, price,id));
            System.out.println("Them thanh cong!!");
            System.out.println("0.Thoat!!(1.de tiep tuc them san pham)");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                break;
            }
        }while (true);
    }
    public static void deleteProduct(Scanner scanner) {
        do {
            if(products.size() == 0) {
                System.out.println("Chua co san pham!!!");
                break;
            }else {
                System.out.println("Menu delete product");
                System.out.println("Nhap id ma san pham ban muon xoa: ");
                String text = scanner.nextLine();
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).getId().equals(text)) {
                        products.remove(i);
                        break;
                    }
                }
                System.out.println("Xoa thanh cong!!");
                System.out.println("0.Thoat!!");
                int choice1 = Integer.parseInt(scanner.nextLine());
                if (choice1 == 0) {
                    break;
                }
            }
        }while (true);

    }
    public static void editProduct(Scanner scanner) {
        do {
            if(products.size() == 0) {
                System.out.println("Chua co san pham!!!");
                break;
            }else {
                System.out.println("Menu edit product");
                System.out.println("Vi tri ban muon sua san pham(1--"+products.size()+"): ");
                int choice2 = Integer.parseInt(scanner.nextLine())-1;
                System.out.println("Ten san pham: "+products.get(choice2).getName());
                String name = scanner.nextLine();
                System.out.println("Gia san pham: "+products.get(choice2).getPrice());
                double price = Double.parseDouble(scanner.nextLine());
                products.get(choice2).setPrice(price);
                products.get(choice2).setName(name);
                System.out.println("Sua thanh cong!!");
                System.out.println("0.Thoat!!");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice == 0) {
                    break;
                }
            }
        }while (true);

    }
    public static void sortedProduct(Scanner scanner) {
        if(products.size() == 0) {
            System.out.println("Chua co san pham!!!");
        }else {
            System.out.println("Menu sortedProduct");
            System.out.println("1.Sap xep theo ten: ");
            System.out.println("2.Sap xep theo gia: ");
            System.out.println("Lua chon cua ban: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Collections.sort(products);
                    display();
                    break;
                case 2:
                    Manager manager = new Manager();
                    products.sort(manager);
                    display();
                    break;
            }
        }
    }
    public static void seachProduct(Scanner scanner) {
        if(products.size() == 0) {
            System.out.println("Chua co san pham!!!");
        }else {
            System.out.println("Menu seach product");
            System.out.println("1.Tim kiem theo ten: ");
            System.out.println("2.Tim kiem theo gia: ");
            System.out.println("Lua chon cua ban: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    seachName(scanner);
                    break;
                case 2:
                    seachPrice(scanner);
                    break;
            }
        }
    }

    private static void seachName(Scanner scanner) {
        System.out.println("Tim kiem theo ten: ");
        System.out.println("Moi ban nhap ten: ");
        String text = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equals(text)) {
                System.out.println("Product " + " : " + " name: " + product.getName() + " price: " + product.getPrice());
            }
        }
    }

    private static void seachPrice(Scanner scanner) {
        System.out.println("Tim kiem theo gia: ");
        System.out.println("1.0-->50 (USD): ");
        System.out.println("2.50-->100 (USD): ");
        System.out.println("3.100-->... (USD): ");
        System.out.println("Lua chon cua ban: ");
        int choice2 = Integer.parseInt(scanner.nextLine());
        switch (choice2) {
            case 1:
                checkPrice(0,50);break;
            case 2:
                checkPrice(50,100);break;
            case 3:
                checkPrice(100,99999);break;
        }
    }
    static void display() {
        if(products.size() == 0) {
            System.out.println("Chua co san pham!!!");
        }else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println("Product " + i + " : " + " name: " + products.get(i).getName() + " price: " + products.get(i).getPrice());
            }
        }
    }

    private static void checkPrice(int price1, int price2) {
        for (Product product : products) {
            if (product.getPrice() > price1 && product.getPrice() < price2) {
                System.out.println("Product " + " : " + " name: " + product.getName() + " price: " + product.getPrice());
            }
        }
    }
}
