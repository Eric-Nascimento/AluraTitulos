import br.com.alura.screenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenMatch.calculos.FiltroRecomendacao;
import br.com.alura.screenMatch.modelos.Episodio;
import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setInclusoNoPlano(false);

        Filme outroFilme = new Filme("Avatarso", 2020);
        outroFilme.setDuracaoEmMinutos(230);
        outroFilme.setInclusoNoPlano(false);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7);
        meuFilme.avalia(5);
        meuFilme.avalia(3);
        //System.out.println("A soma de todas as avaliações é: "+ meuFilme.somaDasAvaliacoes);
        System.out.println("A quantidade de avaliações até o momento é: "+ meuFilme.getTotalAvaliacao());
        System.out.println("A média de avaliações para esse filme é: "+ meuFilme.pegaMedia());

        System.out.println();

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        System.out.println();
        lost.setTemporadas(9);
        lost.setEpisodioPorTemporada(13);
        lost.setMinutosPorEpisodio(47);
        lost.setInclusoNoPlano(true);
        lost.exibeFichaTecnica();

        System.out.println("Duração da série em minutos: "+ lost.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filme3 = new Filme("Gato de botas 2", 2023);
        filme3.setDuracaoEmMinutos(180);
        filme3.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filme3);
        System.out.println("O tamanho da lista de filmes é de "+ listaDeFilmes.size());
        System.out.println("O ultimo filme cadastrado foi o : "+ listaDeFilmes.get(2).getNome());
        System.out.println("E o primeiro foi o "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("E o primeiro foi o "+listaDeFilmes.get(0).toString());

    }
}