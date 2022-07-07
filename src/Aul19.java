import java.util.Scanner;

public class Aul19 {
    static double[] Ordem = new double[3];
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            Ordem[0] = valor.nextDouble();
            Ordem[1] = valor.nextDouble();
            Ordem[2] = valor.nextDouble();
            
            double[] aOrdem = {Ordem[0],Ordem[1],Ordem[2]};
            boolean l = false;
            
            while (l == false) {
                if (Ordem[0] > Ordem[1] || Ordem[1] > Ordem[2] || Ordem[0] > Ordem[2]) {
                    Ordenacao.Selection();
                } else {
                    l = true;
                }
            }

            System.out.println("\n"+Ordem[0]+"\n"+Ordem[1]+"\n"+Ordem[2]+"\n");
            System.out.println(aOrdem[0]+"\n"+aOrdem[1]+"\n"+aOrdem[2]);
        }

    };    

    public static class Ordenacao {
        public static void Selection() {
            double E = Ordem[0];
            double C = Ordem[1];
            double D = Ordem[2];
            if (E > C) {
                Ordem[0] = C;
                Ordem[1] = E;
            } else if (C > D) {
                Ordem[1] = D;
                Ordem[2] = C;
            } else if (E > D) {
                Ordem[0] = D;
                Ordem[2] = E;
            }  
        }
    }
}
