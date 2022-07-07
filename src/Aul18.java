import java.util.Scanner;

//Ia fazer novamente classe statica para isso, mas achei desnecessário e acabou que acabei fazendo igual...

public class Aul18 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            double x = valor.nextDouble();
            double y = valor.nextDouble();
            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            } else if (y > 0 && x > 0) {
                System.out.println("Q1");
            } else if (y > 0 && x < 0) {
                System.out.println("Q2");
            } else if (y < 0 && x < 0) {
                System.out.println("Q3");
            } else if (y < 0 && x > 0) {
                System.out.println("Q4");
            }
        }
    };
}
