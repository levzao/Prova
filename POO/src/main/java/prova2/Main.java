package prova2;

public class Main {
    public static void main(String[] args) {
        
        
        Motoboy motoboy = new Motoboy("147.683", "Barry", "013.164.146-19", "1136.13781-1", 5300);
        Advogado advogado = new Advogado("088.884", "Neymar Ronaldo", "901.810.125-31", "1360.14254-1", 8000);
        Medico medico = new Medico("095.918", "Juan Santos", "991.013.890-01", "71890.67890-1", 15000);
        
        //Exibindo na tela
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(advogado.toString());
        System.out.println("");
        System.out.println(medico.toString());
    }
}
