package Ex_Locadoras_Filmes;

import java.util.Date;

public class Cliente {
    // Atributos:
    private String nomeCliente;
    private String cpf;
    private String dataCadastro;
    private double codigoCliente;

    // Construtor:
    public Cliente(String nomeCliente, String cpf, String dataCadastro, double codigoCliente) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
        this.codigoCliente = codigoCliente;
    }

    // Getters e Setters:
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(double codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
}
