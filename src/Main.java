import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso().setTitulo("curso java").setDescricao("descrição curso java").setCargaHoraria(8);
        Curso curso2 = new Curso().setTitulo("curso js").setDescricao("descrição curso js").setCargaHoraria(4);

        Mentoria mentoria = new Mentoria()
                .setTitulo("mentoria de java")
                .setDescricao("descrição mentoria java")
                .setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp()
                .setNome("Bootcamp Java Developer")
                .setDescricao("Descrição Bootcamp Java Developer")
                .addConteudos(curso1, curso2, mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        exibirConteudosInscritos(devCamila);
        delimitarConteudo();

        devCamila.progredir();
        devCamila.progredir();

        delimitarConteudo();
        exibirConteudosInscritos(devCamila);
        exibirConteudosConcluidos(devCamila);
        exibirTotalXp(devCamila);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        delimitarConteudo();
        exibirConteudosInscritos(devJoao);

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        delimitarConteudo();
        exibirConteudosInscritos(devJoao);
        exibirConteudosConcluidos(devJoao);
        exibirTotalXp(devJoao);
    }

    private static void exibirConteudosInscritos(Dev dev) {
        System.out.printf("Conteúdos Inscritos %s: %s\n", dev.getNome(), dev.getConteudosInscritos().toString());
    }

    private static void exibirConteudosConcluidos(Dev dev) {
        System.out.printf("Conteúdos Inscritos %s: %s\n", dev.getNome(), dev.getConteudosConcluidos().toString());
    }

    private static void exibirTotalXp(Dev dev) {
        System.out.printf("XP: %.2f\n", dev.calcularTotalXp());
    }

    private static void delimitarConteudo() {
        System.out.println("-------");
    }

}
