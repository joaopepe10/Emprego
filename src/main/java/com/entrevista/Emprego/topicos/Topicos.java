package com.entrevista.Emprego.topicos;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_topicos")
public class Topicos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTopico;
    private String nomeTopico;
    private String descricaoTopico;

    public Topicos() {
        this.idTopico = null;
    }

    public Topicos(String nomeTopico, String descricaoTopico) {
        this.idTopico = null;
        this.nomeTopico = nomeTopico;
        this.descricaoTopico = descricaoTopico;
    }

    public Integer getIdTopico() {
        return idTopico;
    }

    public void setIdTopico(Integer idTopico) {
        this.idTopico = idTopico;
    }

    public String getNomeTopico() {
        return nomeTopico;
    }

    public void setNomeTopico(String nomeTopico) {
        this.nomeTopico = nomeTopico;
    }

    public String getDescricaoTopico() {
        return descricaoTopico;
    }

    public void setDescricaoTopico(String descricaoTopico) {
        this.descricaoTopico = descricaoTopico;
    }
}
