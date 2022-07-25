package br.com.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private String titulo;
    private String descricao;
    private LocalDate data;



    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao("descricao mentoria java")+ '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return X_PPADRAO + 20d;
    }
}
