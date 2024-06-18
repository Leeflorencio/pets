package com.br.house.pets;

import com.br.house.pets.dto.Animal;
import com.br.house.pets.enums.PetSexo;
import com.br.house.pets.enums.StatusAdocao;
import com.br.house.pets.service.AnimalService;

import java.util.Scanner;

public class HousePets {

    private static AnimalService animalService;

    private static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        animalService = new AnimalService();

        System.out.println("Bem vindo ao sistema de cadastro de Pets da House Pets. \n Escolha uma opção:\n");

        System.out.println(" 1 - Cadastro \n 2 - Listar todos os pets \n 3 - Buscar pet por nome " +
                "\n 4 - Excluir pet \n 5 - Atualizar cadastro pet");


        int opcao = 0;
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                cadastrarPet();
                break;
            case 2:
                //listarTodos();
                break;
            case 3:
                //buscarPetPorNome();
                break;
            case 4:
                //excluirPet();
                break;
            case 5:
                //atualizarPet();
                break;
        }

    }

    private static void cadastrarPet(){
        //nome, tipo, raca, idade, sexo, peso, statusAdocao

        try {
            System.out.println("Informe o nome do Pet: ");
            var nome = sc.next();

            System.out.println("Informe o tipo do animal: ");
            var tipo = sc.next();

            System.out.println("Informe a raça do Pet: ");
            var raca = sc.next();

            System.out.println("Informe a idade do Pet: ");
            var idade = sc.nextInt();

            System.out.println("Informe o sexo do Pet: ");
            var inputSexo = sc.next().toUpperCase();
            var sexo = PetSexo.valueOf(inputSexo);

            System.out.println("Informe o peso do Pet: ");
            var peso = sc.nextDouble();

            System.out.println("Informe o status de adoção: ");
            var statusAdocao = sc.next().toUpperCase();
            var status = StatusAdocao.valueOf(statusAdocao);

            animalService.cadastrarPet(new Animal(nome, tipo, raca, idade, sexo, peso, status));
            System.out.println("Cadastro realizado com sucesso");

        }catch (Exception e) {
            System.out.println(e);
        }
}


}
