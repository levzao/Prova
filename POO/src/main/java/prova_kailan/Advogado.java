package prova_kailan;

import java.time.LocalDate;


public class Advogado extends Funcionario {
    //Declaração de Variavéis
    private String oab;
    
    //Construtor

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }
    
    //Getter e Setter
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    //Método toString
    @Override
    public String toString() {
       return super.toString() +
               "Advogado" + 
                "\nOAB: " + oab;
    }
        
}
