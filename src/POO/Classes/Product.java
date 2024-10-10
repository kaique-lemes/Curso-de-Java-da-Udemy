package POO.Classes;

import java.text.NumberFormat;

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
        if(quantity>0){
            this.quantity -= quantity;
        }

    }

    public void AddProducts(int quantity) {
        if(quantity>0){
            this.quantity += quantity;
        }

    }

public String toString(){

    return "\n\tName: " +this.name+"\n\tPrice: "+ NumberFormat.getCurrencyInstance().format(this.price)+"\n\tQuantity: "+this.quantity;
}
}
