import java.util.Scanner;

public class Aul12 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int S = valor.nextInt();

            while (S != 2002) {
                
                System.out.println("Senha incorreta");

                S = valor.nextInt();

            };

            System.out.println("Acesso permitido");
        }
    };
}

