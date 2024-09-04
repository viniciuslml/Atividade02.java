import java.util.Scanner;

public class classificacaonotas {
    public static void main(String[] args) {
        Double nota = 0.0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota: ");
        nota = entrada.nextDouble();
        if (nota >= 9.0) {
            System.out.println("Excelente");

        }
        else if (nota >=7.0) {
            System.out.println("Bom");
        }
        else if (nota >=5.0) {
            System.out.println("Satisfatorio");
        }
        else if (nota <5.0) {
            System.out.println("Insatisfatorio");
        }
    }
}