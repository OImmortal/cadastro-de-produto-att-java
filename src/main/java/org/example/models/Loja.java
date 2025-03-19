package org.example.models;

import java.util.ArrayList;

public class Loja {
    private int codigo;
    private String nome;
    private ArrayList<Produto> listaDeProdutos;

    public Loja(int codigo, String nome, ArrayList<Produto> listaDeProdutos) {
        this.codigo = codigo;
        this.nome = nome;
        this.listaDeProdutos = listaDeProdutos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getAllListaDeProdutos() {
        return listaDeProdutos;
    }

    public Produto getProdutoPorCodigo(int codigo) {
        for (Produto produto : listaDeProdutos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }

        return null;
    }

    public void setNewListaDeProdutos(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void addProduto(Produto produto) {
        Produto produtoBuscado = getProdutoPorCodigo(produto.getCodigo());
        if (produtoBuscado != null) {
            System.out.println("Código já cadastrado");
            return;
        }
        listaDeProdutos.add(produto);
    }

}
