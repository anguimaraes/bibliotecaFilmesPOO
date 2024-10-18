package br.com.alura.exercicios;

//Crie uma classe br.com.alura.exercicios.Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número
public class Calculadora {
    int resultado;

    int dobraNumero(int numero){
        resultado = numero * 2;
        return resultado;
    }
}
