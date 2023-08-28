package Exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {
    public void menorNumeroDigitado () {
        int numeroDigitado=0, menorNumero=0, i=0;

        while (i<5) {
        String numeroDigitadoStg = JOptionPane.showInputDialog("Digite um número!");
        numeroDigitado = Integer.parseInt(numeroDigitadoStg);

        if (numeroDigitado < menorNumero || i==0) {
            menorNumero=numeroDigitado;            
        }//fim if
        i++;
        }//fim while
        System.out.println("O menor número digitado foi: " + menorNumero);
    }// fim main

}// fim class
