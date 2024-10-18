public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //criando um metodo para acessar a propriedade privada totalDeAvaliacoes
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica(){
        System.out.println("O nome do filme é: " + nome);
        System.out.println("O ano de lançamento é: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
