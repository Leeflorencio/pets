package com.br.house.pets.dto;

import java.time.LocalDateTime;

public class Doacao {

    private Long id;
    private Animal animal;
    private Pessoa adotante;
    private LocalDateTime dataAdocao;
    private String observacoes;
}
