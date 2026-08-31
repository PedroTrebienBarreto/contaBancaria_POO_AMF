public class Titular {

    private String nome;
    private String cpf;
    private String dataNasc;

    Titular(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = data;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido");
            return;
        }

        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}


