package br.com.alura.screenMatch.calculos;


import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Serie;
import br.com.alura.screenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

   /* public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
