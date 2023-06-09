package prova_kailan;

import java.time.LocalDate;


public class Medico extends Funcionario{
    //Declaração de Variavéis 
    private String crm;
    
    //Construtor

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }
    
    //Getter e Setter
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    //Método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString() + 
                "Médico" + 
                "\nCRM: " + crm;
    }
    
    
}
