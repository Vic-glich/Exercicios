import java.util.Scanner;

public class Aul2 {
    public static void main(String[] args) throws Exception {
        try (Scanner Val = new Scanner(System.in)) {
            double A = Val.nextDouble();
    
            double B = Val.nextDouble();

            double C = Val.nextDouble();
    
            if ((A == 0) | (B * B - 4 * A * C < 0)) {
                System.out.println("Valores não aceitaveis, tente novamente.");
                return;
            }

            double bhask = Math.sqrt((B * B) - 4 * A * C);

            double R1 = (-B + bhask)/ (2 * A);

            double R2 = (-B - bhask)/ (2 * A);

            System.out.println(String.format("R1 = %.5f",R1));
            System.out.println(String.format("R2 = %.5f",R2));
        };


    }
}
