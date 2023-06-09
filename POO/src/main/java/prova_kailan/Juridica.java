package prova_kailan;

public class Juridica extends Pessoa {

    //Declaração de Variavéis
    private String cnpj;
    private String inscricaoEstadual;

    //Construtor
    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    //Getter e Setter
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
                "Juridica" + 
                "CNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }
    
}
