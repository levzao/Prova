package prova3;

public abstract class Pessoa {
    
    protected String email;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(String email, String nome, String telefone, Endereco endereco) {
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    

    @Override
    public String toString() {
        return  
                
                "\nNome: " + nome + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\nEndereço: " + endereco;
    }
    
    
}
