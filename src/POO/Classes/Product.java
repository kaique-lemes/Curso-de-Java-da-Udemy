package POO.Classes;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public void AddProducts(int quantity) {
        this.quantity += quantity;
    }

public String toString(){

    return "\n\tName: " +this.name+"\n\tPrice: "+this.price+"\n\tQuantity: "+this.quantity;
}
}
