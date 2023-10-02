package org.bootcamp;

import org.bootcamp.dominio.Conteudo;
import org.bootcamp.dominio.Curso;
import org.bootcamp.dominio.Mentoria;

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



        System.out.println("Hello world!");
    }
}