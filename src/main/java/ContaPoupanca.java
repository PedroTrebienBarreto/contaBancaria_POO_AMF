public class ContaPoupanca extends ContaBancaria {


    public ContaPoupanca(Titular titular){
        super(titular);
    }


    protected void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
        } else {
            saldo = saldo + saldo * percentual / 100;
            System.out.println("Rendimento de " + percentual + "% na conta de " + getTitular().getNome());
        }
    }

}
