package org.bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    LocalDate data;

    public Mentoria() {

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo=" + getTitulo() +"\n"+
                "descricao=" + getDescricao() +"\n"+
                "data=" + data +"\n"+
                '}';
    }
}
