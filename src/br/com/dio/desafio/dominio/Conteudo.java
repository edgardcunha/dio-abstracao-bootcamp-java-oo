package br.com.dio.desafio.dominio;

import org.jetbrains.annotations.Contract;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public Conteudo() {}

    public String getTitulo() {
        return this.titulo;
    }

    public Conteudo setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Conteudo setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public abstract double calcularXp();
}
