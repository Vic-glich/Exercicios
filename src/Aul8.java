import java.util.Scanner;

public class Aul8 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int N = valor.nextInt();
            
            for (int I=1; I <= N; I++) {
                System.out.println(I+" "+(I*I)+" "+(I*I*I));
            };
        }
    };
} //Aqui eu não sei o que mudar não :/
