package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> contedosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp) {
        this.contedosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir () {
        Optional<Conteudo> conteudo = this.contedosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.ConteudosConcluidos.remove(conteudo.get());
            this.contedosInscritos.remove(conteudo.get());
        } else {
            System.err.println("você não está matriculado em nenhum conteúdo!");
        }

    }

    public double calculartotalXp () {
        return this.ConteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getContedosInscritos() {
        return contedosInscritos;
    }

    public void setContedosInscritos(Set<Conteudo> contedosInscritos) {
        this.contedosInscritos = contedosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contedosInscritos, dev.contedosInscritos) && Objects.equals(ConteudosConcluidos, dev.ConteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contedosInscritos, ConteudosConcluidos);
    }
}
