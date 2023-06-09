package prova3;

public class Juridica extends Pessoa{
    
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, String email, String nome, String telefone, Endereco endereco) {
        super(email, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
 

 

    

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


    @Override
    public String toString() {
        return super.toString() +
                "\nCNPJ: " + cnpj + 
                "\ninscricao Estadual: " + inscricaoEstadual; 

    }

    boolean getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
