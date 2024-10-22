import br.com.alura.CalculadoraDeTempo.CalculadoraDeTempo;
import br.com.alura.CalculadoraDeTempo.FiltroRecomendacao;
import br.com.alura.bibliotecaFilmesPOO.modelos.Episodio;
import br.com.alura.bibliotecaFilmesPOO.modelos.Filme;
import br.com.alura.bibliotecaFilmesPOO.modelos.Serie;
import br.com.alura.exercicios.Calculadora;
import br.com.alura.exercicios.Pessoa;

public class Principal {
    public static void main(String[] args) {
        //intanciando a classe
        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        Serie serie1 = new Serie();
        Serie serie2 = new Serie();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();

        //Definindos os Filmes
        filme1.setNome("O poderoso chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.exibeFichaTecnica();

        filme2.setNome("Avatar");
        filme2.setDuracaoEmMinutos(200);

        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        //System.out.println("O total de avaliações é: " + filme1.getTotalDeAvaliacoes());
        //System.out.println(filme1.pegaMedia());



        //pessoa1.exibeOlaMundo();

        /*calculadora1.dobraNumero(10);
        System.out.println(calculadora1.resultado);*/


        //Definindo as Séries
        serie1.setNome("The last of us");
        serie1.setTemporadas(1);
        serie1.setAnoDeLancamento(2023);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(60);
        serie1.setDuracaoEmMinutos(serie1.getMinutosPorEpisodio() * serie1.getEpisodiosPorTemporada());

        serie2.setNome("One Piece");
        serie2.setTemporadas(1);
        serie2.setAnoDeLancamento(2023);
        serie2.setEpisodiosPorTemporada(8);
        serie2.setMinutosPorEpisodio(60);
        serie2.setDuracaoEmMinutos(serie1.getMinutosPorEpisodio() * serie1.getEpisodiosPorTemporada());




        //System.out.println("A duração total da série The last of us em minutos é: " + serie.getDuracaoEmMinutos() + " minutos");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        //calculadora.inclui(filme1);
        //calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        calculadora.inclui(serie2);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);



    }
}
