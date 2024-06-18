package com.br.house.pets.dao;

import com.br.house.pets.ConnectionFactory;
import com.br.house.pets.dto.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EnderecoDAO {
    private Connection conn;

    public EnderecoDAO(Connection connection, ConnectionFactory connectionFactory) {
        this.conn = connection;
    }

    public void cadastrarEndereco(Endereco endereco){

        String sql = "INSERT INTO endereco (rua, numero, complemento, bairro, cidade, estado, cep)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setInt(2, endereco.getNumero());
            preparedStatement.setString(3, endereco.getComplemento());
            preparedStatement.setString(4, endereco.getBairro());
            preparedStatement.setString(5, endereco.getCidade());
            preparedStatement.setString(6, endereco.getEstado());
            preparedStatement.setString(7, endereco.getCep());

            preparedStatement.execute();
            preparedStatement.close();


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
