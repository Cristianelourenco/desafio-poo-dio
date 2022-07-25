package br.com.dio.desafio;

public class Curso extends Conteudo{

    private int cargahoraria;

    public Curso() {
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;

    }

    @Override
    public String toString() {
        return "curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao("descricao mentoria java") + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return X_PPADRAO * cargahoraria;
    }
}
