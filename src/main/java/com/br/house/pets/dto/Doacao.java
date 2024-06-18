package com.br.house.pets.dto;

import java.time.LocalDateTime;

public class Doacao {

    private Long id;
    private Animal animal;
    private Pessoa adotante;
    private LocalDateTime dataAdocao;
    private String observacoes;

    public Doacao(Long id, Animal animal, Pessoa adotante, LocalDateTime dataAdocao, String observacoes) {
        this.id = id;
        this.animal = animal;
        this.adotante = adotante;
        this.dataAdocao = dataAdocao;
        this.observacoes = observacoes;
    }

    public Doacao (){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Pessoa getAdotante() {
        return adotante;
    }

    public void setAdotante(Pessoa adotante) {
        this.adotante = adotante;
    }

    public LocalDateTime getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDateTime dataAdocao) {
        this.dataAdocao = dataAdocao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Doacao{" +
                "id=" + id +
                ", animal=" + animal +
                ", adotante=" + adotante +
                ", dataAdocao=" + dataAdocao +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }
}
