package br.com.alura.CalculadoraDeTempo;

import br.com.alura.bibliotecaFilmesPOO.modelos.Filme;
import br.com.alura.bibliotecaFilmesPOO.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }
}
