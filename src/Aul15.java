import java.util.Scanner;

public class Aul15 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int a = valor.nextInt();

            int b = valor.nextInt();

            int c = valor.nextInt();

            int d = valor.nextInt();

            if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) {
                System.out.println("Valores aceitos");
                } else {
                System.out.println("Valores nao aceitos");
                }
        }
    }; //Ia colocar uma lista e um while para resumir, mas fiquei em duvida se era melhor, então deixei assim mesmo :/
}
