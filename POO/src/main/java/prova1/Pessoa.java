package prova1;

public abstract class Pessoa {

    //Declaração de Variavéis
    protected String nome;
    protected String telefone;

    //Construtor
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //toString
    @Override //Pode ser alterado 
    public String toString() {
        return "\nNome: " + nome
                + "\nTelefone: " + telefone;
    }

}
