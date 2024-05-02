import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja Bem-vindo ao Banco Terminal!");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu Nome:");
        String nome = scanner.next();

        System.out.println("Digite o numero da sua Agencia com o digito:");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o seu Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome +",");
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia);        
        System.out.println("conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");        


    }
}
