package prova_kailan;

public class Endereco{

    //Declaração de Variavéis(Protected)
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String cep;
    protected UnidadeFederativa uf;

    //Construtor

    public Endereco(String logradouro, String numero, String complemento, String cep, UnidadeFederativa uf, String nome, String telefone, String email, Endereco endereco) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.uf = uf;
    }
    

    //Getter e Setter
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
//Método toString

    @Override //Pode ser alterado
    public String toString() {
       return super.toString() +
               "Endereço" + 
                "\nLogradouro" + logradouro + 
                "\nNúmero: " + numero + 
                "\nComplemento: " + complemento + 
                "\nCEP: " + cep + 
                "\nUnidade Federativa: " + uf;
    }

}
