package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {}

    public Mentoria setData(LocalDate data) {
        this.data = data;
        return this;
    }

    @Override
    public Mentoria setTitulo(String titulo) {
        super.setTitulo(titulo);
        return this;
    }

    @Override
    public Mentoria setDescricao(String descricao) {
        super.setDescricao(descricao);
        return this;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
