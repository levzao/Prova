package prova1;

import java.time.LocalDate;

public class Cliente extends Fisica{
    //Declaração de Variavéis
    private int protocoloAtendimento;
    
    //Construtor

    public Cliente(int protocoloAtendimento, String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(cpf, rg, dataNascimento, nome, telefone);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }


    @Override
    public String toString() {
        return "Cliente" + 
                "Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
}
