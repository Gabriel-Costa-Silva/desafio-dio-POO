package org.bootcamp;

import org.bootcamp.dominio.Curso;
import org.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Curso de java");
        curso1.setCargaHoraria(40);

        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("Curso de javascript");
        curso2.setCargaHoraria(80);

        System.out.println(curso2);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("curso javascript");
        mentoria1.setDescircao("Curso de javascript");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);



        System.out.println("Hello world!");
    }
}