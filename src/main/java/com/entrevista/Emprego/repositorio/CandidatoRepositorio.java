package com.entrevista.Emprego.repositorio;

import com.entrevista.Emprego.candidato.Candidato;
import org.springframework.data.repository.CrudRepository;

public interface CandidatoRepositorio extends CrudRepository<Candidato, Integer> {
    //Cadastra  candidato
    <CandTemp extends Candidato> CandTemp  save(CandTemp candTemp);

    //Remove candidato
    void delete(Candidato candidato);

    //Lista candidatos
    Iterable<Candidato> findAll();

}
