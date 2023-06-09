package prova3;

import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa{
    
    private Genero genero;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Fisica(Genero genero, String cpf, String rg, LocalDate dataNascimento, double salario, String email, String nome, String telefone, Endereco endereco) {
        super(email, nome, telefone, endereco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

   
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
}

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGenero: " + genero + 
                "\nCPF: " + cpf + 
                "\nRG " + rg + 
                "\nData de Nascimento=" + dataNascimento + 
                "\nSalário: " + salario +
                "\nIdade: " + getIdade();
    }

    boolean getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

    
