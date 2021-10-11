// Este teste mostra o loop de pedido de informações. As informações serão pedidas 2 vezes.

import java.util.Scanner;

public class ScannerExem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 2;
        int idade = 2;
        String nome;

        for (i = 0; i < 2; i++) {
            System.out.println("Informe seu nome: ");
            nome = teclado.nextLine();

            System.out.println("Informe sua idade: ");
            idade = Integer.parseInt(teclado.nextLine());

            System.out.println(nome + " tem " + idade + " anos.");
        }

        teclado.close();
    }
}
