package br.com.alura.LiterALura.Repository;

import br.com.alura.LiterALura.Model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNome(String name);

    // @Query("SELECT a FROM autor  WHERE a.anoMorte > :ano")
    List<Autor>findByAnoMorteGreaterThan(Integer ano);

}