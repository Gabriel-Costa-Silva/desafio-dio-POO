package org.bootcamp.dominio;

import java.util.*;

public class Dev {

    private String nome;

    private String RA;

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }



    public Dev() {

    }
    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo > conteudoEmProgressao = this.conteudosInscritos.stream().findFirst();
        if(conteudoEmProgressao.isPresent()){
            this.conteudosConcluidos.add(conteudoEmProgressao.get());
            this.conteudosInscritos.remove(conteudoEmProgressao.get());
        }else{
            System.err.println("Voce não está matriculado em nenhum conteudo!!!");
        }

    }
    public double calcularXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp)
                .sum();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", RA='" + RA + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(RA, dev.RA) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, RA, conteudosInscritos, conteudosConcluidos);
    }
}
