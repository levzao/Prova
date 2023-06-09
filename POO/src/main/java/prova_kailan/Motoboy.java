package prova_kailan;

import java.time.LocalDate;


public class Motoboy extends Funcionario{
    //Declaração de Variavéis
    private String cnh;
    
    //Construtor

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }

  
    
    //Getter e Setter
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
    
    //Método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString() +
                "Motoboy" + 
                "\nCNH: " + cnh;
    }
    
    
}
