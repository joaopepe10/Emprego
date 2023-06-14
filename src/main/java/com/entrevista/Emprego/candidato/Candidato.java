package com.entrevista.Emprego.candidato;

import com.entrevista.Emprego.entrevistador.Entrevistador;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_candidato")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidato;
    @Column(name = "nome_candidato")
    private String nome;
    @Column(name = "email_candidato")
    private String email;
    @Column(name = "telefone_candidato")
    private String telfone;
    @Column(name = "nota_candidato")
    private Integer nota;
    @ManyToOne
    @JoinColumn(name = "idEntrevistador")
    private Entrevistador entrevistador;
    public Candidato() {
        this.idCandidato = null;
    }

    public Candidato(String nome,
                     String email, String telfone,
                     Integer nota, Entrevistador entrevistador) {
        this.idCandidato = null;
        this.nome = nome;
        this.email = email;
        this.telfone = telfone;
        this.nota = nota;
        this.entrevistador = entrevistador;
    }

    public Integer getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(Integer idCandidato) {
        this.idCandidato = idCandidato;
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

    public String getTelfone() {
        return telfone;
    }

    public void setTelfone(String telfone) {
        this.telfone = telfone;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Entrevistador getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(Entrevistador entrevistador) {
        this.entrevistador = entrevistador;
    }
}
