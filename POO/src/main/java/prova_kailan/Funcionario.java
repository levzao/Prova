package prova_kailan;

import java.time.LocalDate;


public class Funcionario extends Fisica {
    //Declaração de Variavéis
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor setor;
    protected double salario;

    //Construtor

    public Funcionario(String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    //Getter e Setter
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() +
                "Funcionário" +
                "\nCPF: " + cpf +
                "\nRG: " + rg +
                "\nMatrícula: " + matricula +
                "\nSetor: " + setor + 
                "\nSalário: " + salario;
    }
    
    
}
