package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    // Método para adicionar um item ao carrinho
    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        itens.add(item);
        System.out.println(nome + " adicionado ao carrinho.");
    }

    // Método para remover um item pelo nome
    public void removerItem(String nome) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itens.remove(item);
                System.out.println(nome + " removido do carrinho.");
                return;
            }
        }
        System.out.println(nome + " não encontrado no carrinho.");
    }

    // Método para calcular o valor total do carrinho
    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }

    // Método para exibir todos os itens no carrinho
    public void exibirItens() {
        if (itens.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionar itens ao carrinho
        carrinho.adicionarItem("Laptop", 2500.00, 1);
        carrinho.adicionarItem("Smartphone", 1500.00, 2);
        carrinho.adicionarItem("Fone de Ouvido", 200.00, 3);

        // Exibir itens no carrinho
        carrinho.exibirItens();

        // Remover item do carrinho
        carrinho.removerItem("Smartphone");

        // Exibir itens após remoção
        carrinho.exibirItens();

        // Calcular o valor total do carrinho
        double valorTotal = carrinho.calcularValorTotal();
        System.out.printf("Valor total do carrinho: R$%.2f%n", valorTotal);
    }
}

