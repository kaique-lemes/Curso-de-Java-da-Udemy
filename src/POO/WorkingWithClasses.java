package POO;

import POO.Classes.Product;
import POO.Classes.Triangulo;

import java.util.Scanner;

public class WorkingWithClasses {


    public static void TrianguloCalc() {

        Scanner scanner = new Scanner(System.in);

        int a, b, c = 0;
        System.out.print("insert the side of the triangle: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("insert the side of the triangle: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("insert the side of the triangle: ");
        c = Integer.parseInt(scanner.nextLine());
        Triangulo triangulo = new Triangulo(a, b, c);

        triangulo.getData();
        System.out.print("Triangle area: " + triangulo.area());
        scanner.close();

    }

    public static void CreatingAProduct() {
        Scanner stringScanner= new Scanner(System.in);
        Scanner scanner= new Scanner(System.in);
        String prodName; double prodPrice; int prodQuantity;
        System.out.print("\n Product name: ");
        prodName =stringScanner.nextLine();
        System.out.print("\n Price: ");
        prodPrice=scanner.nextDouble();
        System.out.print("\n Quantity: ");
        prodQuantity= scanner.nextInt();

        Product prod = new Product(prodName,prodPrice,prodQuantity );
        System.out.println("\nTotal value in stock: "+prod.totalValueInStock());
        System.out.println("Product: "+prod);
        scanner.close();
        stringScanner.close();
    }

}
