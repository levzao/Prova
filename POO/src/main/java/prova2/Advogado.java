package prova2;

//Extends
public class Advogado extends Funcionario {
    
    //Declaração de Variavéis
    private String oab;

    //Contrutores

    public Advogado(String oab, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.oab = oab;
    }
    

    //Getter e Setter
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
    //método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString() + 
                "\nOAB" + oab;
    }
    
    
}
