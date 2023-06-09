package prova_kailan;


public enum Genero{
    MASCULINO("M", "Masculino"),
    FEMININO("F", "Feminino");
    
    //Declaração de Constantes
    private String caractere;
    private String nome;
    
    //Construtor

    private Genero(String caractere, String nome) {
        this.caractere = caractere;
        this.nome = nome;
    }

}
