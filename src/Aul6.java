import java.util.Scanner;

public class Aul6 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int[] val = new int[5];
            int d;
            int i = 0;
            int tot = 0;

            for (d=0; d < 5; d++) {
                val[d] = valor.nextInt();
            };

            while (i < 5) {
                if ((val[i] % 2) != 0) {
                    i++;
                }
                else {
                    tot++;
                    i++;
                };
            };
            System.out.println(tot+" números pares");
        }
    };
}
