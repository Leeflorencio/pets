package com.br.house.pets;

import com.br.house.pets.dto.Animal;
import com.br.house.pets.dto.Endereco;
import com.br.house.pets.service.EnderecoService;

import java.util.Scanner;

public class PetsEndereco {

    private static EnderecoService enderecoService;
    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");


    public static void main(String[] args) {

        enderecoService = new EnderecoService();

        System.out.println("Bem vindo ao sistema de cadastro de Endereços da House Pets. \n Escolha uma opção:\n");

        System.out.println(" 1 - Cadastro \n 2 - Listar todos os pets \n 3 - Buscar pet por nome " +
                "\n 4 - Excluir pet \n 5 - Atualizar cadastro pet");


        int opcao = 0;
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                cadastrarEndereco();
                break;
            case 2:
                //listarTodos();
                break;
        }

    }

    private static void cadastrarEndereco(){
        //rua, numero, complemento, bairro, cidade, estado, cep
        try {
            System.out.println("Informe a Rua: ");
            var rua = sc.next();

            System.out.println("Informe o número: ");
            var numero = sc.nextInt();

            System.out.println("Informe o complemento: ");
            var complemento = sc.next();

            System.out.println("Informe o bairro: ");
            var bairro = sc.next();

            System.out.println("Informe a cidade: ");
            var cidade = sc.next();

            System.out.println("Informe o estado: ");
            var estado = sc.next();

            System.out.println("Informe o CEP");
            var cep = sc.next();

            enderecoService.cadastrarEndereco(new Endereco(rua, numero, complemento, bairro, cidade, estado, cep));
            System.out.println("Endereço cadastrado com sucesso");

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
