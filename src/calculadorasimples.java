import java.util.Scanner;

public class calculadorasimples {
    public static void main(String[] args) {
        Double numero1, numero2 = 0.0;
        String operacao = "+,-,*,/";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        numero2 = entrada.nextDouble();
        System.out.println("digite a operação");
        operacao = entrada.next();
        entrada.close();

        if (operacao.equals("+")) {
            System.out.println(numero1 + "+" + numero2 + " = " + (numero1 + numero2));
        } else if (operacao.equals("-")) {
            System.out.println(numero1 + "-" + numero2 + " = " + (numero1 - numero2));
        } else if (operacao.equals("*")) {
            System.out.println(numero1 + "*" + numero2 + " = " + (numero1 * numero2));
        } else if (operacao.equals("/")) {
            System.out.println(numero1 + "/" + numero2 + " = " + (numero1 / numero2));
        }


    }

}