package com.tiago.democrudtiago.entities;

public class Alunos {
    private int id;
    private String nome;
    private String sexo;
    private int idade;

    public Alunos(int id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    



}
