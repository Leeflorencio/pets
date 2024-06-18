package com.br.house.pets.dao;

import com.br.house.pets.ConnectionFactory;
import com.br.house.pets.dto.Animal;
import com.br.house.pets.dto.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AnimalDAO {

    private Connection conn;

    public AnimalDAO(Connection connection, ConnectionFactory connectionFactory) {
        this.conn = connection;
    }


    public void cadastrarPet(Animal pet) {

        String sql = "INSERT INTO animal (nome, tipo, raca, idade, sexo, peso, statusAdocao)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, pet.getNome());
            preparedStatement.setString(2, pet.getTipo());
            preparedStatement.setString(3, pet.getRaca());
            preparedStatement.setInt(4, pet.getIdade());
            preparedStatement.setString(5, pet.getSexo().name());// Converte enum para String
            preparedStatement.setDouble(6, pet.getPeso());
            preparedStatement.setString(7, pet.getStatusAdocao().name());

            preparedStatement.execute();
            preparedStatement.close();


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
