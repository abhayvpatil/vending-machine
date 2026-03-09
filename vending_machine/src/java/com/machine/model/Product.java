package vending_machine.src.java.com.machine.model;

public class Product {

    //Fields

    private String name;  
    private double price;

    //Args and NoArgs Constructors

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product()
    {

    }

    //getters and setters

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

    //toString

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}
