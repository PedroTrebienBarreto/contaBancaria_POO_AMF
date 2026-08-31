public class Main {

    public static void main(String[] args) {

        Banco bb = new Banco();

        bb.criarConta("Pedro", "123456", "22/03/2000");

        bb.buscarConta(1);

        bb.depositar(1500, 1);

        bb.mostrarSaldo(1);

    }
}
