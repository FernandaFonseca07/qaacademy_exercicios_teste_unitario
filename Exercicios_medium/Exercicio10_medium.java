package Exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio10_medium {
    public void calculoFibonacci() {
        int elemento, i = 2;
        String elementoDigitado;
        elementoDigitado = JOptionPane.showInputDialog("Digite o número para calcular o Fibonacci!");
        elemento = Integer.parseInt(elementoDigitado);

        int[] fibonacci;
        fibonacci = new int[elemento];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        while (i < elemento) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            i++;
        }

        imprimeElementosFibonacci(elemento, fibonacci);

    }

    private void imprimeElementosFibonacci(int elemento, int[] fibonacci) {
        int i;
        i = 0;

        while (i < elemento) {
            System.out.println("Termo: " + (i + 1) + " do Fibonacci é: " + fibonacci[i]);
            i++;
        }
    }
}
