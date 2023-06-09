package prova2;

public class Medico extends Funcionario {
    
    //Declaraçaõ de Variavéis
    private String crm;

    //Contrutores
    public Medico(String crm, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    // Getters e Setters
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
                "\nCRM: " + crm;
    }
    
    
}
