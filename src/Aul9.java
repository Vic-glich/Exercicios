import java.util.Scanner;

public class Aul9 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int N = valor.nextInt();

            for (int I=1; I <= N; I++) {
                int X = valor.nextInt();

                System.out.println("Resposta "+I+": "+X);
            };
        }
    }; //Deu para substituir o Y deixando apenas o I criado no For
}
