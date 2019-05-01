package com.example.lodjinha.model;

public class Produto {

    private int id;
    private String nome;
    private double precoDe;
    private double precoPor;
    private String urlImagem;
    private Categoria categoria;

    public Produto(int id, String nome, double precoDe, double precoPor, String urlImagem, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.precoDe = precoDe;
        this.precoPor = precoPor;
        this.urlImagem = urlImagem;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoDe() {
        return precoDe;
    }

    public double getPrecoPor() {
        return precoPor;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
