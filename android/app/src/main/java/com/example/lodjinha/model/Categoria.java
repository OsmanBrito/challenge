package com.example.lodjinha.model;

public class Categoria {

    private int id;
    private String descricao;
    private String urlImagem;

    public Categoria(int id, String descricao, String urlImagem) {
        this.id = id;
        this.descricao = descricao;
        this.urlImagem = urlImagem;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrlImagem() {
        return urlImagem;
    }
}
