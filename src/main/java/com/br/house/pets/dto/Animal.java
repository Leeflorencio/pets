package com.br.house.pets.dto;

import com.br.house.pets.enums.PetSexo;
import com.br.house.pets.enums.StatusAdocao;

public class Animal {

    private Long id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private PetSexo sexo;
    private double peso;
    private StatusAdocao statusAdocao;

    public Animal(Long id, String nome, String tipo, String raca, Integer idade, PetSexo sexo, double peso, StatusAdocao statusAdocao) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.statusAdocao = statusAdocao;
    }

    public Animal(){}

    public Animal(String nome, String tipo, String raca, int idade, PetSexo sexo, double peso, StatusAdocao statusAdocao) {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public PetSexo getSexo() {
        return sexo;
    }

    public void setSexo(PetSexo sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public StatusAdocao getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(StatusAdocao statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", statusAdocao=" + statusAdocao +                '}';
    }

}
