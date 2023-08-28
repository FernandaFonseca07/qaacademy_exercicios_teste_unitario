package qaacademy_exercicios_teste_unitario.Exercicios_easy;

public class Exercicio11_easy {

public void calculoInteracoes(int numero) {
    int i=1;

    while (i<=100) {
        numero = numero + 2;
        System.out.println("O cálculo da interação " + i + " é: " + numero);
        i++;
    }
    

}
}
