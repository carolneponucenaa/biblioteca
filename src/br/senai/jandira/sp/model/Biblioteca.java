package br.senai.jandira.sp.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Livros> livros = new ArrayList<>();

    public void AdicionarLivro(Livros livro) {

        livros.add(livro);
    }

    public void ConsultarLivro() {
        System.out.println("Os livros da lista são: ");
        for (Livros livro : livros) {
            System.out.println(livro.titulo);
            System.out.println(livro.emprestado);

            }

        }
    }
