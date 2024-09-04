import java.util.Scanner;

public class verificacaoaprovacaoescolar {
    public static void main(String[] args) {
        double media=0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a media do aluno: ");
        media = entrada.nextDouble();
        if (media>=7.0 && media<=10.0) {
            System.out.println("Aluno aprovado com sucesso!");
        }
        else if (media>=5.0 && media<7.0) {
            System.out.println("Recuperação");
        }
        else if (media <5.0) {
            System.out.println("Aluno reprovado");
        }
    }
}