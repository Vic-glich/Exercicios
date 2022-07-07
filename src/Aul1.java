import java.util.Scanner;

public class Aul1 {
    public static void main(String[] args) throws Exception {
        try (Scanner l = new Scanner(System.in)) {  
            int a = l.nextInt();
            
            int b = l.nextInt();
            
            System.out.print("Prod = "+a*b);
        };
    }
}
