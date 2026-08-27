public class ContaBancaria {


    String titular;
    double saldo;

    void Exibir(){
        System.out.println("========= Dados da conta =========");
        System.out.println("- Titular: "+titular );
        System.out.println("- Saldo: "+saldo );
        System.out.println("----------------------------");

    }
    void depositar(double valor){
        saldo += valor;
    }
    void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saque invalido!");
        } else {
            saldo -= valor;
        }
    }
}
