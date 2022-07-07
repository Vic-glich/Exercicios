import java.util.Scanner;

public class Aul14 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int Soma = 0;
            int cont = 0;

            int N = valor.nextInt(); 

            while (N >= 0) {
                cont++;
                Soma += N;

                N = valor.nextInt();
            };

            double result = Soma / cont;
            System.out.println(String.format("%.2f",result)); //coloquei os mesmos valores, mas não me retorna numeros decimais
        }
    };
}
