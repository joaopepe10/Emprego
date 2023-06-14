package com.entrevista.Emprego.controle;

import com.entrevista.Emprego.entrevistador.Entrevistador;
import com.entrevista.Emprego.repositorio.EntrevistadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrevistador")
public class EntrevistadorControle {
    @Autowired
    private EntrevistadorRepositorio acoes;
    @RequestMapping(value = "/listar", method=RequestMethod.GET)
    public @ResponseBody List<Entrevistador> listar(){
        return (List<Entrevistador>) acoes.findAll();
    }
    //CADASTRO DE ENTREVISTADOR
    @RequestMapping(value = "/listar", method = RequestMethod.POST)
    public @ResponseBody Entrevistador cadastro(@RequestBody Entrevistador entrevistador){
        return acoes.save(entrevistador);
    }

}
