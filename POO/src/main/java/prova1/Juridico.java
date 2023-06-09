package prova1;

public class Juridico extends Pessoa{
    
    //Declaração de Variavéis
    protected String cnpj;
    protected String inscricaoEstadual;

    //Construtor
    public Juridico(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    //Getters e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

   //Método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString() +
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }
    
    
}
