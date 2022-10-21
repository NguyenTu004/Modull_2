package Product;

import Comparable_Comparator.Student;

public class Product implements Comparable <Product>{
    private String name;
    private double price;
    private String id;


    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product product) {
        return this.getName().compareTo(product.getName());
    }
}
