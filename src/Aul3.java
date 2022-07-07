import java.util.Scanner;

public class Aul3 {
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            String Name = valor.next();

            double Sal = valor.nextDouble();

            double comis = valor.nextDouble();

            double Med = (comis*0.15)+Sal;

            System.out.println(String.format(Name+" recebe: %.2f",Med));
            //String format =  usar cacso tenha limitação de casas
            //"%.3f" = Valoror + numero de casas decimais
        }
    }
}
