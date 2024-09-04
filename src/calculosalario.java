import java.util.Scanner;

public class calculosalario {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o salário bruto
        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = scanner.nextDouble();


        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalho = scanner.nextInt();


        double bonus = 0.0;
        double imposto = 0.0;
        double salarioLiquido = 0.0;

        if (anosTrabalho > 10) {
            bonus = 0.10 * salarioBruto;
        } else if (anosTrabalho >= 5) {
            bonus = 0.05 * salarioBruto;
        }

        if (salarioBruto > 5000) {
            imposto = 0.27 * salarioBruto;
        } else if (salarioBruto >= 3000) {
            imposto = 0.18 * salarioBruto;
        } else {
            imposto = 0.10 * salarioBruto;
        }

        salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário bruto: R$ " + String.format("%.2f", salarioBruto));
        System.out.println("Bônus recebido: R$ " + String.format("%.2f", bonus));
        System.out.println("Imposto descontado: R$ " + String.format("%.2f", imposto));
        System.out.println("Salário líquido: R$ " + String.format("%.2f", salarioLiquido));


        scanner.close();
    }
}