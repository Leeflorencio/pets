package com.br.house.pets.service;

import com.br.house.pets.ConnectionFactory;
import com.br.house.pets.dao.AnimalDAO;
import com.br.house.pets.dao.EnderecoDAO;
import com.br.house.pets.dto.Animal;
import com.br.house.pets.dto.Endereco;

import java.sql.Connection;
import java.util.Set;

public class EnderecoService {

    private ConnectionFactory connectionFactory;

    public EnderecoService(){
        this.connectionFactory = new ConnectionFactory();
    }


    public void cadastrarEndereco(Endereco endereco){
        Connection conn = connectionFactory.recuperarConexao();
        new EnderecoDAO(conn, connectionFactory).cadastrarEndereco(endereco);
    }

    public Set<Endereco> listarTodos() {
        Connection conn = connectionFactory.recuperarConexao();
        return new EnderecoDAO(conn, connectionFactory).listarTodos();
    }

    public Endereco buscarEndereco(String rua){
        Connection conn = connectionFactory.recuperarConexao();
        return new EnderecoDAO(conn, connectionFactory).buscarEnderecoPorNome(rua);
    }

    //public void excluirEndereco()
}
