package br.com.alura.screenMatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {

    }

    public Titulo() {

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalAvaliacao (){
        return totalAvaliacao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Duração em minutos: "+duracaoEmMinutos);
        System.out.println("Incluso no plano: "+inclusoNoPlano);


    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacao++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacao;
    }
}
