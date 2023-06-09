package prova3;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua Dendezeiro","1793", "Casa", "4004-751", "Salvador", "BA");
        Fisica fisica = new Fisica(Genero.MASCULINO, "130.084.140-13", "11314.814-13", LocalDate.of(2004, Month.SEPTEMBER, 13), 7800, "joaalves@gmail.com", "Joao Alves", "+55 71 98713-8134", endereco);
        Juridica juridica = new Juridica("7890.7894", "67890", "velaslvez@hotmail.com", "Velas Dums", "+01 13018-141", endereco);
        
        System.out.println(fisica.toString());
        System.out.println(fisica.getEndereco());
        System.out.println("");
        System.out.println(juridica.toString());
        System.out.println(juridica.getEndereco());
    }   
}
