import br.com.alura.bibliotecaFilmesPOO.modelos.Filme;
import br.com.alura.bibliotecaFilmesPOO.modelos.Serie;
import br.com.alura.exercicios.Calculadora;
import br.com.alura.exercicios.Pessoa;

public class Principal {
    public static void main(String[] args) {
        //intanciando a classe
        Filme meuFilme = new Filme();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        //System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.pegaMedia());

        //pessoa1.exibeOlaMundo();

        /*calculadora1.dobraNumero(10);
        System.out.println(calculadora1.resultado);*/

        Serie serie = new Serie();
        serie.setNome("The last of us");
        serie.setTemporadas(1);
        serie.setAnoDeLancamento(2023);
        serie.setEpisodiosPorTemporada(8);
        serie.setMinutosPorEpisodio(60);

        System.out.println("A duração total da série The last of us em minutos é: " + serie.getDuracaoEmMinutos() + " minutos");

    }
}
