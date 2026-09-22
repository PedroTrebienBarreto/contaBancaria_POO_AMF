public class ContaCorrente extends ContaBancaria{


    ContaCorrente(Titular titular){
        super(titular);
    }

    @Override
    void sacar(double valor) {
        double custo = valor+0.5;
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta de " + getTitular().getNome()
                    + ": saque R$ " + valor + " mais tarifa, saldo R$ " + saldo);
        } else {
            saldo = saldo - custo;
            movimentacoes.add(valor * -1);
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + getTitular().getNome());
        }
    }


}
