import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        double saldo = 100.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao seu Banco Virtual!\n");

        System.out.println("Digite seu nome e sobrenome em seguida pressione ENTER:");
        String nomeCliente = scanner.next();

        if (nomeCliente.isEmpty()){
            System.out.println("Nome inválido, tente novamente!");
            return;
        }

        System.out.println("ok " + nomeCliente + " para prosseguir digite um número com 4 dígitos que representará sua agência bancária em seguida pressione ENTER:");
        String agencia = scanner.next();

        if (agencia.length() != 4){
            System.out.println("Número de agência inválido, tente novamente!");
            return;
        }

        System.out.println("ok, por favor digite um número com 4 dígitos para sua conta bancária em seguida pressione ENTER:");
        String numero = scanner.next();

        if (numero.length() != 4){
            System.out.println("Número de conta bancária inválido, tente novamente!");
            return;
        }

        System.out.println("\nTudo certo " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n Sua agência é " + agencia +",\n Conta " + numero + " \n E seu saldo bônus de R$" + saldo + " já está disponível para saque!");



    }
}
