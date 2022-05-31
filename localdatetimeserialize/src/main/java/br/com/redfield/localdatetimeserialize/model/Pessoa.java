package br.com.redfield.localdatetimeserialize.model;

import java.time.LocalDateTime;

public class Pessoa {

    private String nome;
    private LocalDateTime bornDate;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDateTime bornDate) {
        this.nome = nome;
        this.bornDate = bornDate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDateTime bornDate) {
        this.bornDate = bornDate;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", bornDate=" + bornDate +
                '}';
    }
}
