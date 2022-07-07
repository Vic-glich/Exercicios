import java.util.Scanner;

public class Aul16 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            double v = valor.nextDouble();
            if (v >= 0 && v <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (v > 25 && v <= 50) {
                System.out.println("Intervalo (25,50]");
            } else if (v > 50 && v <= 75) {
                System.out.println("Intervalo (50,75]");
            } else if (v > 75 && v <= 100) {
                System.out.println("Intervalo (75,100]");
            } else {
                System.out.println("Fora de intervalo");
            }
        }
    }; //Acabei fazendo parecido, só adaptei as variáveis mesmo, não tinha o que mudar aqui
}
