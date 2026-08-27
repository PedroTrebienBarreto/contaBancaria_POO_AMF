public class Main {

    public static void main(String[] args){

        Titular titular1 = new Titular("João Pascal", "12345", null);
        ContaBancaria c1 = new ContaBancaria(titular1);

        c1.depositar(500.0);
        c1.sacar(100.0);
        c1.aplicarRendimento(10.0);

        c1.exibirSaldo();
    }
}
