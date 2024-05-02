package br.com.alura.screenMatch.modelos;

import br.com.alura.screenMatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public Filme() {
        super();

    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public String toString(){
        return "Filme: "+ this.getNome() + " (" + this.getAnoDeLancamento() + " )";
    }
}
