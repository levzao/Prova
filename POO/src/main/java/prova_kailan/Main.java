package prova_kailan;

import prova2.Advogado;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
       Endereco endereco = new Endereco("Rua", "20", "Casa", "144", UnidadeFederativa.BAHIA, "Vae", "713", "3", "qe");
       
       
        System.out.println(endereco.toString());
        System.out.println();
}
}