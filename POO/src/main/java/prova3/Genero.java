package prova3;

public enum Genero {
    
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
          
     private final char caracter;
    private final String texto;
   

    private Genero(char caracter, String texto) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
}
