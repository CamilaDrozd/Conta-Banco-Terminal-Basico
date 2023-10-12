import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o nome da Agência: ");
        int numeroAgencia = terminal.nextInt();

        System.out.println("Digite o nome da Agência: ");
        String nomeAgencia = terminal.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = terminal.nextLine();

        System.out.println("Diigite seu saldo: ");
        double saldo = terminal.nextDouble();


        System.out.println("Olá " + nomeCliente + " , obrigado por criar uma " +
                " conta em nosso banco, sua agência é " + nomeAgencia +
                " , conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");



    }



}
