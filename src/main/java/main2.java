import br.com.dio.desafio.*;
import br.com.dio.desafio.Curso;

import java.time.LocalDate;

public class main2 {
    private static Conteudo mentoria;

    public static void main(String[] args) {
      Curso curso1 = new Curso();
      curso1.setTitulo("curso java");
      curso1.setDescricao("descricao curso java");
      curso1.setCargahoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("curso java");
      curso2.setDescricao("descricao curso js");
      curso2.setCargahoraria(4);


     /* Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria de java");
      mentoria.getDescricao("descricao mentoria java");
      mentoria.setData(LocalDate.now());*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp.Java Developer");
        bootcamp.getDesccricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCristiane = new Dev();
        devCristiane.setNome("Cristiane");
        Bootcamp Bootcamp = null;
        devCristiane.increverBootcamp(Bootcamp);
        devCristiane.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Incritos Cristiane" + devCristiane.getContedosInscritos());
        System.out.println("Conteúdos Concluidos Cristiane" + devCristiane.getConteudosConcluidos());
        System.out.println("Xp:" + devCristiane.calculartotalXp());


        System.out.println(".....");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.increverBootcamp(Bootcamp);
        devCristiane.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Incritos Pedro" + devPedro.getContedosInscritos());
        System.out.println("Conteúdos Concluidos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("Xp:" + devCristiane.calculartotalXp());
    }
}

