import java.util.ArrayList;

public class ContaBancaria {

    private Integer id;
    private Titular titular;
    protected double saldo;
    protected ArrayList<Double> movimentacoes = new ArrayList<>();

    ContaBancaria(Titular titular, Integer id) {
        this.titular = titular;
        this.saldo = 0;
        this.id = id;
    }

    ContaBancaria(Titular titular){

    }

    public ContaBancaria() {

    }

    protected void exibirExtrato() {
        for(Double mov : movimentacoes) {
            System.out.println("\nMovimentacao: " + mov);
        }
    }

    protected void mostrarTotalDepositado() {
        Double valorTotal = 0.00;
        for(Double mov : movimentacoes) {
            if (mov > 0) {
                valorTotal += mov;
            }
        }

        System.out.println("Total Depositado: " + valorTotal);
    }

    protected void mostrarMaiorSaque() {
        Double maiorSaque = movimentacoes.getFirst();

        for(Double mov : movimentacoes) {
            if(mov < maiorSaque) {
                maiorSaque = mov;
            }
        }

        System.out.println("Maior Saque: " + maiorSaque);
    }

    protected void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido na conta de " + titular.getNome() + ": R$ " + valor);
        } else {
            saldo = saldo + valor;
            movimentacoes.add(valor);
            System.out.println("Depósito de R$ " + valor + " na conta de " + titular.getNome());
        }
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente na conta de " + titular.getNome());
        } else {
            saldo = saldo - valor;
            movimentacoes.add(valor * -1);
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + titular.getNome());
        }
    }

    protected void exibirSaldo() {
        System.out.println("Conta de " + titular.getNome() + ": R$ " + saldo
                + " em " + movimentacoes.size() + " transações");
    }

    protected void transferirOrigem(Double valor){
        this.saldo -= valor;
        movimentacoes.add(valor * -1);
    }
    protected void transferirDestino(Double valor){
        this.saldo+=valor;
        movimentacoes.add(valor);
    }


    protected void setTitular(Titular titular){
        this.titular = titular;
    }

    protected void setId(Integer id){
        this.id = id;
    }

    protected Titular getTitular(){
        return this.titular;
    }
    protected Integer getId(){
        return this.id;
    }

    protected Double getSaldo(){
        return this.saldo;
    }
}
