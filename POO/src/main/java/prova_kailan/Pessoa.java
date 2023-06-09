package prova_kailan;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {

    //Declaração de Variavéis
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    //Construtor
    public Pessoa(String nome, String telefone, String email, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
//Método toString

    @Override //Pode alterar
    public String toString() {
        return super.toString() +
                "Pessoa" + 
                "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nE-mail: " + email + 
                "\nEndereço=" + endereco;
    }
    
}
