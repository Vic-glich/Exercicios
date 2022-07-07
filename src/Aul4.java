import java.util.Scanner;

public class Aul4 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int[] notas = {100,50,20,10,5,2,1};
            int Val = valor.nextInt();
            int d = 0;
            int r;
            while (Val != 0) {
                if (Val >= notas[d]) {
                    r = Val / notas[d];  
                    System.out.println(r+" notas de R$"+notas[d]+",00");
                    Val = Val - (notas[d] * r);
                    d += 1;
                }
                else {
                    System.out.println("0 notas de R$"+notas[d]+",00");
                    d += 1;    
                };
            };
        }
    }
}
