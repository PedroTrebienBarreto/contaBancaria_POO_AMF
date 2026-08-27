public class ContaBancaria {


    Titular titular;
    double saldo;
    int operacoes;

    ContaBancaria(Titular titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido na conta de " + titular.nome + ": R$ " + valor);
        } else {
            saldo = saldo + valor;
            operacoes = operacoes + 1;
            System.out.println("Depósito de R$ " + valor + " na conta de " + titular.nome);
        }
    }

    void sacar(double valor) {
        double custo = valor + 0.50;
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta de " + titular.nome
                    + ": saque R$ " + valor + " mais tarifa, saldo R$ " + saldo);
        } else {
            saldo = saldo - custo;
            operacoes = operacoes + 1;
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + titular.nome);
        }
    }

    void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
        } else {
            saldo = saldo + saldo * percentual / 100;
            System.out.println("Rendimento de " + percentual + "% na conta de " + titular.nome);
        }
    }

    void exibirSaldo() {
        System.out.println("Conta de " + titular.nome + ": R$ " + saldo + " (" + operacoes + " operações)");
    }
}
