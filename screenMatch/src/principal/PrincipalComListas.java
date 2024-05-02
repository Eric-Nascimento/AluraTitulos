package principal;

import br.com.alura.screenMatch.modelos.Filme;
import br.com.alura.screenMatch.modelos.Serie;
import br.com.alura.screenMatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatarso", 2020);
        var filme3 = new Filme("Gato de botas 2", 2023);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filme3);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
        }


    }
}
