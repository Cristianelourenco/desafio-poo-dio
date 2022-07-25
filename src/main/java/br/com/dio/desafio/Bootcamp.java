package br.com.dio.desafio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

     private String nome;
     private String desccricao;
     private final LocalDate dataInicial = LocalDate.now();
     private final LocalDate dataFinal = dataInicial.plusDays(45);
     private Set<Dev> DevInscritos = new HashSet<>();
     private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesccricao(String descricao_bootcamp_java_developer) {
        return desccricao;
    }

    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevInscritos() {
        return DevInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        DevInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(desccricao, bootcamp.desccricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(DevInscritos, bootcamp.DevInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, desccricao, dataInicial, dataFinal, DevInscritos, conteudos);
    }
}
