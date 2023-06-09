package prova_kailan;


public enum UnidadeFederativa{
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_JANEIRO("Rio de Janeiro", "RJ");
    
    //Declaração de Constantes
    private String nome;
    private String sigla;

    //Construtor
    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    
}
