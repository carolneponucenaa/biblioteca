package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Menu {

    public void Menu() {
        Scanner teclado = new Scanner(System.in);

        Cadastro cadastro = new Cadastro();
        Livros livros = new Livros();
        Usuarios usuarios = new Usuarios();

        boolean continuar = true;


        while (continuar) {

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-//-");
            System.out.println("-------------------- BEM VINDO Á BIBLIOTECA --------------------");
            System.out.println("Escolha uma das opções:");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Livro");
            System.out.println("3 - Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-//-");

            int userOption = teclado.nextInt();

            switch (userOption) {

                case 1:
                    cadastro.UsuariosCadastro();
                    break;

                case 2:
                    cadastro.CadastrarLivros();
                    break;

                case 3:
                    continuar = false;
                    break;

            }
        }

    }

}