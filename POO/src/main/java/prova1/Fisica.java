package prova1;

import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa {

    //Declaração de Variavéis
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    //Construtor
    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    //Getter e Setter
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString()
                + "\nCPF: " + cpf
                + "\nRG: " + rg
                + "\nData de Nascimento: " + dataNascimento
                + "\nIdade: " + this.getIdade();    

    }

}
