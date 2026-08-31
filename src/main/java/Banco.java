import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaBancaria> contas = new ArrayList<>();

    public Banco() {
    }

    public void criarConta(String nome, String cpf, String dataNasc){
        Titular titular = new Titular(nome, cpf, dataNasc);
        ContaBancaria conta = new ContaBancaria();
        if (contas.isEmpty()) {
            conta.setTitular(titular);
            conta.setId(1);
        } else {
            conta.setTitular(titular);
            conta.setId(contas.size()+1);
        }
        contas.add(conta);
        System.out.println("Conta criada com sucesso! Titular: "+conta.getTitular().getNome());
        System.out.println("ID da conta: "+ conta.getId());
    }

    public ContaBancaria buscarConta(Integer id){
        for (ContaBancaria conta : contas){
            if (conta.getId().equals(id)){
                System.out.println("Conta Encontrada!");
                return conta;
            }
        }
        System.out.println("A conta não existe no sistema");
        return null;
    }

    public void depositar(Integer valor, Integer id) {
        if (valor <= 0) {
            System.out.println("A quantidade a ser deposita deve ser maior do que R$0");
            return;
        } else {
            ContaBancaria conta = buscarConta(id);
            conta.depositar(valor);
        }
    }

    public void sacar(Integer valor, Integer id){
        ContaBancaria conta = buscarConta(id);
        if (conta.getSaldo() < valor){
            System.out.println("Saldo insuficiente para saque");
            return;
        } else {
            conta.sacar(valor);
            return;
        }
    }

    public void aplicarRendimento(Integer percentual, Integer id){
        ContaBancaria conta = buscarConta(id);
        conta.aplicarRendimento(percentual);
        return;
    }

    public void mostrarSaldo(Integer id){
        ContaBancaria conta = buscarConta(id);
        conta.exibirSaldo();
        return;
    }

    public void mostrarExtrato(Integer id){
        ContaBancaria conta = buscarConta(id);
        conta.exibirExtrato();
        return;
    }

    public void mostrarTotalDepositado(Integer id){
        ContaBancaria conta = buscarConta(id);
        conta.mostrarTotalDepositado();
        return;
    }

    public void mostrarMaiorSaque(Integer id){
        ContaBancaria conta = buscarConta(id);
        conta.mostrarMaiorSaque();
        return;
    }

}
