package prova_kailan;

public enum Setor {
    //Declaracão de Constantes
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    OPERACOES("Operações");
    
    //Declaração de Variavéis
    private String nome;
    
    //Construtor
    private Setor(String nome) {
        this.nome = nome;
    }
    
    
}
