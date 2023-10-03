package org.bootcamp;

import org.bootcamp.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Conteudo curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso de java");
        ((Curso) curso1).setCargaHoraria(40);

        System.out.println(curso1);


        Conteudo curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Curso de javascript");
        ((Curso) curso2).setCargaHoraria(80);

        System.out.println(curso2);


        Conteudo mentoria1 = new Mentoria();
        mentoria1.setTitulo("curso javascript");
        mentoria1.setDescricao("Curso de javascript");
        ((Mentoria) mentoria1).setData(LocalDate.now());

        System.out.println(mentoria1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("new bootcamp");
        bootcamp.setDescricao("bootcamp novo");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev newDev = new Dev();

        newDev.setNome("GABRIEL");
        newDev.setRA("123123123");
        newDev.setConteudosInscritos(bootcamp.getConteudos());
        newDev.progredir();
        System.out.println("Conteudos inscritos : "+ newDev.getConteudosInscritos() );


        Dev oldDev = new Dev();

        oldDev.setNome("SUZANA");
        oldDev.setRA("123123123");
        oldDev.setConteudosInscritos(bootcamp.getConteudos());

        oldDev.progredir();
        oldDev.progredir();
        System.out.println("Conteudos inscritos : "+ oldDev.getConteudosInscritos() );

        System.out.println("Hello world!");
    }
}