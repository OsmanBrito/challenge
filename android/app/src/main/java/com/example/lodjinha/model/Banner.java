package com.example.lodjinha.model;

public class Banner {

    private int id;
    private String linkUrl;
    private String urlImagem;

    public Banner(int id, String linkUrl, String urlImagem) {
        this.id = id;
        this.linkUrl = linkUrl;
        this.urlImagem = urlImagem;
    }

    public int getId() {
        return id;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public String getUrlImagem() {
        return urlImagem;
    }
}
