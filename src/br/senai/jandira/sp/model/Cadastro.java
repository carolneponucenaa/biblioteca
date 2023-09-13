package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Cadastro {

    public Object Cadastro;
    Scanner teclado = new Scanner(System.in);
    Livros livros = new Livros();
    Usuarios usuarios = new Usuarios();

    public void UsuariosCadastro(){
        System.out.println("-------------- Cadastro De Usuário ---------------- ");
        System.out.println("Informe seu nome completo: ");
        usuarios.nome = teclado.nextLine();
        System.out.println("Informe seu endereço: ");
        usuarios.endereco = teclado.nextLine();
        System.out.println("Informe seu email: ");
        usuarios.email = teclado.next();
        System.out.println("Informe seu telefone: ");
        usuarios.telefone = teclado.next();
        System.out.println("--------------- Usuários Cadastrado com Sucesso -----------------");
    }
    public Livros CadastrarLivros(){
        System.out.println("-------------- Cadastro De Livro ---------------- ");
        System.out.println("Informe o título do livro: ");
        livros.titulo = teclado.nextLine();
        System.out.println("Informe o gênero do livro: ");
        livros.genero = teclado.nextLine();
        System.out.println("Informe o autor do livro: ");
       livros.autor= teclado.nextLine();
        System.out.println("Informe o ISBN do livro (Código): ");
        livros.ISBN = teclado.nextInt();
        teclado.nextLine();
        System.out.println("--------------- Livro Cadastrado com Sucesso -----------------");

    return livros;

    }

    }
