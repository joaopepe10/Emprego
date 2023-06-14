package com.entrevista.Emprego.entrevistador;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_entrevistador")
public class Entrevistador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrevistador")
    private Integer idEntrevistador;
    @Column(name = "nome_entrevistador")
    private String nome;
    @Column(name = "email_entrevistador")
    private String email;
    @Column(name = "telefone_entrevistador")
    private String telefone;

    public Entrevistador() {
        this.idEntrevistador = null;
    }

    public Entrevistador(String nome, String email, String telefone) {
        this.idEntrevistador = null;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Integer getIdEntrevistador() {
        return idEntrevistador;
    }

    public void setIdEntrevistador(Integer idEntrevistador) {
        this.idEntrevistador = idEntrevistador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
