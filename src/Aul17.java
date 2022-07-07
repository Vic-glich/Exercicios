import java.text.DecimalFormat;
import java.util.Scanner;

//Lembrando, pelo menos aqui no vscode, deve-se usar uma virgula ao colocar os valores

public class Aul17 {
    static double[] Notas = new double[4];
    static double media = 0; 
    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.0");

            for (int N = 1; N <= 4; N++) {
                double Nota = valor.nextDouble();
                Provas.Notas(N, Nota);
            }

            Provas.Media();

            if (media < 7 && (media >= 5 && media <= 6.9)) {
                System.out.println("Media: "+df.format(media));
                System.out.println("Aluno em exame");

                double Exame = valor.nextDouble(); 
                Provas.mFinal(Exame);

                System.out.println("Nota do exame: "+df.format(Exame));

                if (media < 5) {
                    System.out.println("Aluno reprovado");
                    System.out.println("Media final: "+df.format(media));
                } else {
                    System.out.println("Aluno aprovado");
                    System.out.println("Media final: "+df.format(media));
                }

            } else if (media < 7 && media < 5) {
                System.out.println("Media: "+df.format(media));
                System.out.println("Aluno reprovado");
            } else if (media >= 7) {
                System.out.println("Media: "+df.format(media));
                System.out.println("Aluno aprovado");
            }
        }
    };

    public static class Provas {
        public static void Notas(int nProva, double Nota) {
            Notas[nProva - 1] = Nota;
        }

        public static void Media() {
            media += (Notas[0]+Notas[1]+Notas[2]+Notas[3]) / 4;
        }

        public static void mFinal(double Exame) {
            media = (media + Exame) / 2;
        }
    };
}
