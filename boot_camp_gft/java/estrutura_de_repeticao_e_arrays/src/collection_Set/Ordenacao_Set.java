package collection_Set;

import java.util.*;

public class Ordenacao_Set {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie>minhasSeries = new HashSet<>(){{
           add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome()+"-" + serie.getGenero()+"-" + serie.getTempoEpisodio());


        System.out.println("\n--\tOrdem de Inserção\t--");
        Set<Serie>minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got","fantasia",60));
            add(new Serie("dark","drama",60));
            add(new Serie("that '70s show","comedia",25));
        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome()+"-" + serie.getGenero()+"-" + serie.getTempoEpisodio());

        System.out.println("\n--\tOrdem natural (TempoEpisodio_\t--");
        Set<Serie>minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome()+ "-" + serie.getGenero()+ "-" + serie.getTempoEpisodio());



    }

}


class  Serie implements Comparable<Serie> {


    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio !=0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}