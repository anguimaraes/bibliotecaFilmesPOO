package br.com.alura.CalculadoraDeTempo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){

        if (classificavel.getClassificacao() >= 4){

            System.out.println("Classificação alta");

        } else if (classificavel.getClassificacao() >= 2) {

            System.out.println("Classificação média");

        } else{

            System.out.println("Classificação baixa");
        }
    }
}
