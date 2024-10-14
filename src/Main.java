import POO.WorkingWithClasses;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Exibindo o menu para o usuário
            System.out.println("\n===== Menu de Funções =====");
            System.out.println("1 - Calcular a área de um triângulo");
            System.out.println("2 - Criar um produto e imprimir com toString");
            System.out.println("3 - Registrar quartos para alugar");
            System.out.println("4 - Usar boxing, unboxing e class wrapper");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            // Lendo a opção do usuário
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Calcular a área do triângulo
                    WorkingWithClasses.TrianguloCalc();
                    break;
                case 2:
                    // Criar um objeto e imprimir com toString
                    WorkingWithClasses.CreatingAProduct();
                    break;
                case 3:
                    // Registrar quartos para alugar
                    WorkingWithClasses.rentingRooms();
                    break;
                case 4:
                    // Boxing, unboxing e class wrapper
                    WorkingWithClasses.wrapperClass();
                    break;
                case 5:
                    // Sair do programa
                    continuar = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}