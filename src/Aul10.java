import java.util.Scanner;

public class Aul10 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int I = 1;

            int J = 60;

            while (J >= 0) {
                System.out.println("I = "+I+"    J = "+J);

                J -= 5;

                I++; //Incrementador
            };
        }
    };
}
