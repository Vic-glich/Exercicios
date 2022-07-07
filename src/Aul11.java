import java.util.Scanner;

public class Aul11 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int Y = 0;

            int X = 1;

            while (X != Y) {
                X = valor.nextInt();
    
                Y = valor.nextInt();

                if (X > Y) {
                    System.out.println("Decrescente");
                } else if (X < Y) { //Coloquei esse else if pois estava ainda dando 'cresccente' no else, mesmo com valores iguais
                    System.out.println("Crescente");
                } 
            };
        }
    };
}
