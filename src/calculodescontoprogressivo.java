import java.util.Scanner;

public class calculodescontoprogressivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto = 0.0;
        double valorDesconto = 0.0;
        double valorFinal = valorCompra;

        if (valorCompra > 500) {
            percentualDesconto = 20.0;
        } else if (valorCompra >= 200) {
            percentualDesconto = 10.0;
        } else if (valorCompra >= 100) {
            percentualDesconto = 5.0;
        } else {
            percentualDesconto = 0.0;
        }

        valorDesconto = (percentualDesconto / 100) * valorCompra;
        valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original da compra: R$ " + String.format("%.2f", valorCompra));
        System.out.println("Percentual de desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor descontado: R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Valor final da compra: R$ " + String.format("%.2f", valorFinal));

        scanner.close();
    }
}