package com.tarefa;

public class Genero {

    private String nome;
    private String masculino;
    private String feminino;

    public Genero() {

    }

    public Genero(String nome, String masculino, String feminino) {
        this.nome = nome;
        this.masculino = masculino;
        this.feminino = feminino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMasculino() {
        return masculino;
    }

    public void setMasculino(String masculino) {
        this.masculino = masculino;
    }

    public String getFeminino() {
        return feminino = "feminino";
    }

    public void setFeminino(String feminino) {
        this.feminino = feminino;
    }
}
