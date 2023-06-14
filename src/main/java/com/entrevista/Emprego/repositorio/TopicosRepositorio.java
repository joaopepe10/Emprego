package com.entrevista.Emprego.repositorio;

import com.entrevista.Emprego.entrevistador.Entrevistador;
import com.entrevista.Emprego.topicos.Topicos;
import org.springframework.data.repository.CrudRepository;

public interface TopicosRepositorio extends CrudRepository<Topicos, Integer> {
    //Cadastra  Topicos

    <TopTemp extends Topicos> TopTemp  save(TopTemp topTemp);

    //Remove Topicos
    void delete(Topicos topicos);

    //Lista Topicos
    Iterable<Topicos> findAll();
}
