package POO;

import POO.Classes.OptionalData;
import POO.Classes.Product;
import POO.Classes.Rent;
import POO.Classes.Triangulo;

import java.text.NumberFormat;
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
        Scanner stringScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String prodName;
        double prodPrice;
        int prodQuantity;
        System.out.print("\n Product name: ");
        prodName = stringScanner.nextLine();
        System.out.print("\n Price: ");
        prodPrice = scanner.nextDouble();
        System.out.print("\n Quantity: ");
        prodQuantity = scanner.nextInt();

        Product prod = new Product(prodName, prodPrice, prodQuantity);
        System.out.println("\nTotal value in stock: " + NumberFormat.getCurrencyInstance().format(prod.totalValueInStock()));
        System.out.println("Product: " + prod);

        System.out.println("\nAdd product to the stock: ");
        prod.AddProducts(scanner.nextInt());
        System.out.println("Product: " + prod);

        System.out.println("\nremove product from the stock: ");
        prod.removeProducts(scanner.nextInt());
        System.out.println("Product: " + prod);

        scanner.close();
        stringScanner.close();
    }

    public static void rentingRooms() {
        Scanner sc = new Scanner(System.in);
        Scanner stringsScanner = new Scanner(System.in);


        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] rooms = new Rent[n];
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Rent #" + (1 + i) + ":");
            System.out.print("Name: ");
            String name = stringsScanner.nextLine();
            System.out.print("Email: ");
            String email = stringsScanner.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();


            rooms[i] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < rooms.length; i++) {

            System.out.println(rooms[i]);

        }
        stringsScanner.close();
        sc.close();
    }

    public static void wrapperClass(){
        Scanner scanner = new Scanner(System.in);

        // Solicita a idade ao usuário
        System.out.println("Por favor, insira a idade (ou deixe em branco para null):");
        String idadeInput = scanner.nextLine();
        Integer idade = null;

        if (!idadeInput.trim().isEmpty()) {
            try {
                idade = Integer.parseInt(idadeInput);  // Boxing automático
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. A idade será null.");
            }
        }

        // Solicita o salário ao usuário
        System.out.println("Por favor, insira o salário (ou deixe em branco para null):");
        String salarioInput = scanner.nextLine();
        Double salario = null;

        if (!salarioInput.trim().isEmpty()) {
            try {
                salario = Double.parseDouble(salarioInput);  // Boxing automático
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. O salário será null.");
            }
        }

        // Criando a instância de OptionalData com os valores inseridos
        OptionalData pessoa = new OptionalData(idade, salario);

        // Exibindo os dados com unboxing
        pessoa.mostrarDados();
    }


}
