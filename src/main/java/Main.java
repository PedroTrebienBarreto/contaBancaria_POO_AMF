public class Main {

    public static void main(String[] args){

        ContaBancaria c1 = new ContaBancaria();
        c1.titular = "Carlos Magno";
        c1.saldo = 100;

        ContaBancaria c2 = new ContaBancaria();
        c2.titular = "Rodrigo";
        c2.saldo = 1000;

        c1.Exibir();
        c2.Exibir();

        c1.sacar(10);
        c2.depositar(100);

        c1.Exibir();
        c2.Exibir();




    }
}
