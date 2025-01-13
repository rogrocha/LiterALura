package br.com.alura.LiterALura.Model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosAutor (
    @JsonAlias("name") String name,
    @JsonAlias("birth_year") int birthYear,  // Corrigido para @JsonAlias
    @JsonAlias("death_year") int deathYear )  // Corrigido para @JsonAlias
{

}
