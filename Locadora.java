package Ex_Locadoras_Filmes;

public class Locadora {
    // Atributos:
    private String nomeLocadora;
    private String cnpjLocadora;
    private String razaoSocialLocadora;
    private String enderecoLocadora;

    // Construtor:
    public Locadora(String nomeLocadora, String cnpjLocadora, String razaoSocialLocadora, String enderecoLocadora) {
        this.nomeLocadora = nomeLocadora;
        this.cnpjLocadora = cnpjLocadora;
        this.razaoSocialLocadora = razaoSocialLocadora;
        this.enderecoLocadora = enderecoLocadora;
    }

    // Getters e Setters:
    public String getNomeLocadora() {
        return nomeLocadora;
    }

    public void setNomeLocadora(String nomeLocadora) {
        this.nomeLocadora = nomeLocadora;
    }

    public String getCnpjLocadora() {
        return cnpjLocadora;
    }

    public void setCnpjLocadora(String cnpjLocadora) {
        this.cnpjLocadora = cnpjLocadora;
    }

    public String getRazaoSocialLocadora() {
        return razaoSocialLocadora;
    }

    public void setRazaoSocialLocadora(String razaoSocialLocadora) {
        this.razaoSocialLocadora = razaoSocialLocadora;
    }

    public String getEnderecoLocadora() {
        return enderecoLocadora;
    }

    public void setEnderecoLocadora(String enderecoLocadora) {
        this.enderecoLocadora = enderecoLocadora;
    }
}
