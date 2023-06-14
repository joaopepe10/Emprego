package com.entrevista.Emprego.controle;

import com.entrevista.Emprego.entrevistador.Entrevistador;
import com.entrevista.Emprego.repositorio.EntrevistadorRepositorio;
import com.entrevista.Emprego.repositorio.TopicosRepositorio;
import com.entrevista.Emprego.topicos.Topicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosControle {
    @Autowired
    private TopicosRepositorio acoes;
    @RequestMapping(value = "/listar", method=RequestMethod.GET)
    public @ResponseBody List<Topicos> listar(){
        return (List<Topicos>) acoes.findAll();
    }
    //CADASTRO DE TOPICOS
    @RequestMapping(value = "/listar", method = RequestMethod.POST)
    public @ResponseBody Topicos cadastro(@RequestBody Topicos topicos){
        return acoes.save(topicos);
    }
}
