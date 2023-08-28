package Exercicios_medium;

public class Exercicio06_medium {
    public int calculoFatorial (int fatorial) {
        int i;
        i = fatorial;
        
        while (i>1) {
            fatorial = fatorial * (i-1);
            i--;       
        }

    return fatorial; 

    } 
} 
