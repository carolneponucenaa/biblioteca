package br.senai.jandira.sp;

import br.senai.jandira.sp.model.Biblioteca;
import br.senai.jandira.sp.model.Cadastro;
import br.senai.jandira.sp.model.Livros;
import br.senai.jandira.sp.model.Menu;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.Menu();
        Cadastro cadastro = new Cadastro();


        Livros livros1 = new Livros();
        cadastro.CadastrarLivros();
        Livros livros2 = new Livros();
        cadastro.CadastrarLivros();
        Livros livros3 = new Livros();
        cadastro.CadastrarLivros();
        Livros livros4 = new Livros();
        cadastro.CadastrarLivros();
        Livros livros5 = new Livros();
        cadastro.CadastrarLivros();

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.AdicionarLivro(livros1);
        biblioteca.AdicionarLivro(livros2);
        biblioteca.AdicionarLivro(livros3);
        biblioteca.AdicionarLivro(livros4);
        biblioteca.AdicionarLivro(livros5);
    }
}
