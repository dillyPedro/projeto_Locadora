package Ex_Locadoras_Filmes;

public class Main {
    // Criar os nossos pedidos (objetos):
    public static void main(String[] args) {
        // Criando a locadora:
        Locadora locadora = new Locadora("Filmes e Cia","123456/0001", "Filmes e Cia", "Rua Antonio Carlos, 181");

        // Criando o cliente:
        Cliente cliente = new Cliente("Pedro Dilly", "11111111111", "13/09/1999", 1);

        // Criando Locação:
        Locacao locacao = new Locacao(cliente, locadora);

        // Adicionar os pedidos na lista "Filmes":
        Filme filme1 = new Filme(1, "Marley e Eu", 3, 3.75);
        locacao.adicionarFilme(filme1);
        Filme filme2 = new Filme(2, "Velozes e Furiosos", 5, 3.20);
        locacao.adicionarFilme(filme2);
        Filme filme3 = new Filme(3, "12 Rounds", 2, 3.10);
        locacao.adicionarFilme(filme3);
        Filme filme4 = new Filme(4, "Peaky Blinders", 1, 4.00);
        locacao.adicionarFilme(filme4);
        Filme filme5 = new Filme(5, "Vikings", 6, 3.00);
        locacao.adicionarFilme(filme5);

        // Retornando o Cupom de Locação:
        locacao.cupomLocacao();

        // Remover um filme do pedido:
        locacao.removerFilme(filme1);

        // Retornando o Cupom de Locação após a removação do objeto "filme1":
        locacao.cupomLocacao();
    }
}
