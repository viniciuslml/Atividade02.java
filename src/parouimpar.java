import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
        Integer numero = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }
    }
}