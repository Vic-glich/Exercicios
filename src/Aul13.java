import java.util.Scanner;

/*
Utilizados uma variavel static para pdoer receber 
valores das classes staticas criadas em forma de 
lista para resumir as linhas
*/

public class Aul13 {
    static int[] val = {0,0,0};
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            int type = valor.nextInt();

            while (type != 4) { 
                Abast.Dados(type);

                type = valor.nextInt();
            };

            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: "+val[0]);
            System.out.println("Gasolina: " +val[1]);
            System.out.println("Diesel: " + val[2]);
        }

    };

    public static class Abast {
        public static void Dados(int tipo) {
            if (tipo == 1) {
                val[0] += 1;
            } else if (tipo == 2) {
                val[1] += 1;
            } else if (tipo == 3) {
                val[2] += 1;
            }               
        }
    };
}
