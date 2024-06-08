package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    public Curso() {
        super();
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public Curso setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        return this;
    }

    @Override
    public String getTitulo() {
        return super.getTitulo();
    }

    @Override
    public Curso setTitulo(String titulo) {
        super.setTitulo(titulo);
        return this;
    }

    @Override
    public Curso setDescricao(String descricao) {
        super.setDescricao(descricao);
        return this;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
