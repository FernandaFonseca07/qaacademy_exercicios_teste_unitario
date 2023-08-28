package Exercicios_easy;

public class Exercicio09_easy {
public void calcularTabuada (int numero) {
   int i=1, resultado;

   while (i<=10) {
    resultado = numero * i;
    System.out.println(numero + " X " + i + " = " + resultado);
    i++;
   }

}
}