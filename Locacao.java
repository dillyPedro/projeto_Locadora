package Ex_Locadoras_Filmes;

import java.util.ArrayList;

public class Locacao {
    // Atributos:
    private Cliente cliente;
    private Locadora locadora;
    private ArrayList<Filme> filmes;

    // Construtor:
    public Locacao(Cliente cliente, Locadora locadora) {
        this.cliente = cliente;
        this.locadora = locadora;
        this.filmes = new ArrayList<Filme>();
    }

    // Métodos Especiais:

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void removerFilme(Filme filme) {
        this.filmes.remove(filme);
    }

    public void cupomLocacao() {
        // Introdução:
        System.out.println("-----------------------------------------");
        System.out.println("           CUPOM DE LOCAÇÃO              ");
        System.out.println("-----------------------------------------");
        // Dados da loja:
        System.out.println("Nome da Locadora: " + this.locadora.getNomeLocadora());
        System.out.println("Endereço da Locadora: " + this.locadora.getEnderecoLocadora());
        System.out.println("Cnpj da Locadora: " + this.locadora.getCnpjLocadora());
        // Dados do Cliente:
        System.out.println("Nome do Cliente: " + this.cliente.getNomeCliente());
        System.out.println("Cpf do Cliente: " + this.cliente.getCpf());
        System.out.println("Codigo do Cliente: " + this.cliente.getCodigoCliente());
        System.out.println("Filmes alugados por " + this.cliente.getNomeCliente());
        // Dados do Pedido:
        int quantidadeFilmes = 0; // Quantidade de produtos;
        double precoTotal = 0; // Valor total dos produtos:
        int i = 0;
        for(i = 0; i < this.filmes.size(); i++) {
            // Retornando Informações dos Produtos Adquiridos:
        System.out.println("Nome do Filme: " + this.filmes.get(i).getNomeFilme() + " | Código do Filme: " + this.filmes.get(i).getCodigoFilme() + " | Quantidade: " + this.filmes.get(i).getQuantFilme() + " | Valor: " + this.filmes.get(i).getValorFilme());
        quantidadeFilmes += filmes.get(i).getQuantFilme();
        precoTotal += filmes.get(i).getValorFilme() * filmes.get(i).getQuantFilme();
        }
        System.out.println("Quantidade de Filmes: " + quantidadeFilmes);
        System.out.println("Valor total a pagar: " + precoTotal);
    }
}
