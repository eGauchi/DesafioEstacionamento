package classe;

import java.util.Scanner;

public class DesafioEstacionamento {
    public static void main(String[] args) {

        MaquinaEstacionamento maquina = new MaquinaEstacionamento();
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Emitir ticket");
            System.out.println("2. Pagar ticket");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    maquina.emitirTicket();
                    break;
                case 2:
                    System.out.print("Digite o número do ticket a ser pago: ");
                    int numeroTicket = entrada.nextInt();
                    maquina.pagarTicket(numeroTicket);
                    break;
                case 3:
                    System.out.println("Saldo total: R$ " + maquina.consultarSaldo());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        entrada.close();
}
}
