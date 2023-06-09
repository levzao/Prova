package prova_kailan;

import java.time.LocalDate;


public class Cliente extends Funcionario {
    //Declaração de Variavéis
    private String protocoloAtendimento;
    
    //Construtor
    public Cliente(String protocoloAtendimento, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
    //Getter e Setter
    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }
    //Método toString
    @Override //Pode ser alterado
    public String toString() {
        return super.toString() +
                "Cliente" + 
                "\nProtocolo de Atendimento: " + protocoloAtendimento;
    }
    
}
