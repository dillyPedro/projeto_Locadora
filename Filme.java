package Ex_Locadoras_Filmes;

public class Filme {
    // Atributos:
    private double codigoFilme;
    private String nomeFilme;
    private int quantFilme;
    private double valorFilme;

    // Construtor:
    public Filme(double codigoFilme, String nomeFilme, int quantFilme, double valorFilme) {
        this.codigoFilme = codigoFilme;
        this.nomeFilme = nomeFilme;
        this.quantFilme = quantFilme;
        this.valorFilme = valorFilme;
    }

    // Getters e Setters:
    public double getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(double codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getQuantFilme() {
        return quantFilme;
    }

    public void setQuantFilme(int quantFilme) {
        this.quantFilme = quantFilme;
    }

    public double getValorFilme() {
        return valorFilme;
    }

    public void setValorFilme(double valorFilme) {
        this.valorFilme = valorFilme;
    }

    // Métodos Especiais:
    public double calcularTotal(){
        return this.getQuantFilme() * this.getValorFilme();
    }
}
