package org.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria {
    String titulo;

    String descircao;
    LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }



}
