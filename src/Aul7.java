import java.util.Scanner;

public class Aul7 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int N = valor.nextInt();
            
            for (int I=1; I <= N; I++) {
                int X = valor.nextInt();

                int Y = valor.nextInt();

                if ((Y == 0) | ((X % Y) != 0)) {
                    System.out.println("Divisão impossível");
                } else {
                    System.out.println((double)X/Y);
                }
            };
        }
    };
}
