package com.entrevista.Emprego.controle;

import com.entrevista.Emprego.candidato.Candidato;
import com.entrevista.Emprego.entrevistador.Entrevistador;
import com.entrevista.Emprego.repositorio.CandidatoRepositorio;
import com.entrevista.Emprego.repositorio.EntrevistadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidato")
public class CandidatoControle {
    @Autowired
    private CandidatoRepositorio acoes;
    @RequestMapping(value = "/listar", method=RequestMethod.GET)
    public @ResponseBody List<Candidato> listar(){
        return (List<Candidato>) acoes.findAll();
    }
    //CADASTRO DE CANDIDATO
    @RequestMapping(value = "/listar", method = RequestMethod.POST)
    public @ResponseBody Candidato cadastro(@RequestBody Candidato candidato){
        return acoes.save(candidato);
    }
}
