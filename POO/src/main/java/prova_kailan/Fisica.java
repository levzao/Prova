package prova_kailan;

import java.time.LocalDate;

public abstract class Fisica extends Pessoa {

    //Declaração de Variavéis
    protected LocalDate dataNascimento;
    protected Genero genero;

    //Construtor
    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    //Getter e Setter
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    //Método toString

    @Override //Pode ser alterado
    public String toString() {
        return "Fisica" + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nGenero=" + genero;
    }
    
}
