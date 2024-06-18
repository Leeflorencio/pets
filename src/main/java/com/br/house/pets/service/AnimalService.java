package com.br.house.pets.service;

import com.br.house.pets.ConnectionFactory;
import com.br.house.pets.dao.AnimalDAO;
import com.br.house.pets.dto.Animal;

import java.sql.Connection;

public class AnimalService {

    private ConnectionFactory connectionFactory;

    public AnimalService(){
        this.connectionFactory = new ConnectionFactory();
    }


    public void cadastrarPet(Animal pet){
        Connection conn = connectionFactory.recuperarConexao();
        new AnimalDAO(conn, connectionFactory).cadastrarPet(pet);
    }
}
