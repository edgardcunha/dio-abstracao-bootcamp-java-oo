package br.com.dio.desafio.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.*;

@Data
public class Bootcamp {
    protected static final int NUMBER_OF_DAYS = 45;
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(Bootcamp.NUMBER_OF_DAYS);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Bootcamp setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Bootcamp addConteudo(Conteudo conteudo) {
        this.conteudos.add(conteudo);
        return this;
    }

    public Bootcamp addConteudos(Conteudo... conteudos) {
        for (Conteudo conteudo : conteudos) {
            this.addConteudo(conteudo);
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome)
                && Objects.equals(descricao, bootcamp.descricao)
                && Objects.equals(dataInicial, bootcamp.dataInicial)
                && Objects.equals(dataFinal, bootcamp.dataFinal)
                && Objects.equals(devsInscritos, bootcamp.devsInscritos)
                && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
