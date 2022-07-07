import java.util.Scanner;

public class Aul5 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            double[] val = new double[6];
            int d;
            int i = 0;
            int tot = 0;

            for (d=0; d < 6; d++) {
                val[d] = valor.nextInt();
            };

            while (i < 6) {
                if (val[i] < 0) {
                    i++;
                }
                else {
                    tot++;
                    i++;
                };
            };
            System.out.println(tot+" números positivos");
        }
    }
}
