public class ContaUniversitaria extends ContaBancaria{

    public ContaUniversitaria(Titular titular){
        super(titular);
    }
    @Override
    void sacar(double valor) {
        if (valor > 300){
            System.out.println("O limite de saque para contas universitárias é de R$300");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente na conta de " + getTitular().getNome());
        } else {
            saldo = saldo - valor;
            movimentacoes.add(valor * -1);
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + getTitular().getNome());
        }
    }

}
