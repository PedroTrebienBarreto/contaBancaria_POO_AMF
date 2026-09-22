import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        int opt = -1;
        Scanner sc = new Scanner(System.in);
        while(opt!= 0) {
            System.out.println("1 - Criar conta");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Aplicar rendimento");
            System.out.println("8 - Listar Contas");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opt = sc.nextInt();
            sc.nextLine();
            System.out.println("==========================");

            switch (opt){
                case 1:
                    System.out.print("Nome do cliente: ");
                    String nomeDoCliente = sc.nextLine();
                    System.out.print("CPF do cliente: ");
                    String cpf = sc.nextLine();
                    System.out.print("Data de nascimento do cliente: ");
                    String data = sc.nextLine();
                    banco.criarConta(nomeDoCliente, cpf, data);
                    break;
                case 2:
                    System.out.print("Número da conta: ");
                    int numeroDaConta = sc.nextInt();
                    System.out.print("Valor a sacar: ");
                    double valor = sc.nextDouble();
                    banco.sacar(valor, numeroDaConta);
                    break;
                case 3:
                    System.out.print("Número da conta: ");
                    numeroDaConta = sc.nextInt();
                    System.out.print("Valor a depositar: ");
                    valor = sc.nextDouble();
                    banco.depositar(valor, numeroDaConta);
                    break;
                case 4:
                    System.out.print("Número da conta de origem: ");
                    int numeroDaContaOrigem = sc.nextInt();
                    System.out.print("Número da conta de destino: ");
                    int numeroDaContaDestino = sc.nextInt();
                    System.out.print("Valor a ser transferido: ");
                    Double valorASerTranferido = sc.nextDouble();
                    banco.transferir(numeroDaContaOrigem, numeroDaContaDestino, valorASerTranferido);
                    break;
                case 5:
                    System.out.print("Número da conta: ");
                    numeroDaConta = sc.nextInt();
                    banco.mostrarSaldo(numeroDaConta);
                    break;
                case 6:
                    System.out.print("Número da conta: ");
                    numeroDaConta = sc.nextInt();
                    banco.mostrarExtrato(numeroDaConta);
                    break;
                case 7:
                    System.out.print("Número da conta: ");
                    numeroDaConta = sc.nextInt();
                    System.out.print("Percentual do rendimento: ");
                    int percentual = sc.nextInt();
                    banco.aplicarRendimento(percentual, numeroDaConta);
                case 8:
                    banco.mostrarContas();
            }



        }

        sc.close();
    }
}
