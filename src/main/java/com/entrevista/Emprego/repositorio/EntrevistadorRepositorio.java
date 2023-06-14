package com.entrevista.Emprego.repositorio;

import com.entrevista.Emprego.candidato.Candidato;
import com.entrevista.Emprego.entrevistador.Entrevistador;
import org.springframework.data.repository.CrudRepository;

public interface EntrevistadorRepositorio extends CrudRepository<Entrevistador, Integer> {
    //Cadastra  Entrevistador

    <EntreTemp extends Entrevistador> EntreTemp  save(EntreTemp entreTemp);

    //Remove Entrevistador
    void delete(Entrevistador entrevistador);

    //Lista candidatos
    Iterable<Entrevistador> findAll();

}
