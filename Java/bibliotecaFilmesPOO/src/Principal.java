public class Principal {
    public static void main(String[] args) {
        //intanciando a classe
        Filme meuFilme = new Filme();
        Pessoa pessoa1 = new Pessoa();
        Calculadora calculadora1 = new Calculadora();

       /*meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.exibeFichaTecnica();*/

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //pessoa1.exibeOlaMundo();

        /*calculadora1.dobraNumero(10);
        System.out.println(calculadora1.resultado);*/
    }
}
