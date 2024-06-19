package com.br.house.pets.dao;

import com.br.house.pets.ConnectionFactory;
import com.br.house.pets.dto.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

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

    public Set<Endereco> listarTodos(){

        ResultSet resultSet;
        Set<Endereco> enderecos = new HashSet<>();
        String sql = "SELECT rua, numero, complemento, bairro, cidade, estado, cep FROM endereco";

        try{
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){

                String rua = resultSet.getString(1);
                int numero = resultSet.getInt(2);
                String complemento = resultSet.getString(3);
                String bairro = resultSet.getString(4);
                String cidade = resultSet.getString(5);
                String estado = resultSet.getString(6);
                String cep = resultSet.getString(7);

                enderecos.add(new Endereco(rua, numero, complemento, bairro, cidade, estado, cep));
            }
            resultSet.close();
            preparedStatement.execute();
            preparedStatement.close();

        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return enderecos;
    }
}
