import java.util.Scanner;

public class verificacaodelogin {

    public static void main(String[] args) {


        String login = "admin";

        String password = "admin";
        Scanner sc = new Scanner(System.in);

        System.out.print("Login: ");
        String loginInformado = sc.nextLine();

        System.out.print("Password: ");
        String passwordInformada = sc.nextLine();

        if (login.equals(loginInformado) && password.equals(passwordInformada)) {
            System.out.println("Login com sucesso!");
        } else {
            System.out.println("Login ou Senha incorreta!");
        }

    }
}