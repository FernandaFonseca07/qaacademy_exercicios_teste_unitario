package qaacademy_exercicios_teste_unitario.Exercicios_easy;

import javax.swing.JOptionPane;

public class Execucao {
        public static void main(String[] args) {

                // exercicio 02_easy
                Exercicio02_easy exercicio02_easy = new Exercicio02_easy();
                String palavra = exercicio02_easy.retornarPalavra("Fernanda");
                System.out.println(palavra);

                // Exercicio03_easy
                String primeiroValor = JOptionPane.showInputDialog("Digite o primeiro valor!");
                String segundoValor = JOptionPane.showInputDialog("Digite o segundo valor!");
                Exercicio03_easy exercicio03_easy = new Exercicio03_easy();
                System.out.println(exercicio03_easy.retornarValorTrocado(primeiroValor, segundoValor));

                // Exercicio04_easy
                String numeroDigitadoUsuario = JOptionPane.showInputDialog("Digite um número para calcular o dobro");
                int numeroDigitado = Integer.parseInt(numeroDigitadoUsuario);
                Exercicio04_easy exercicio04_easy = new Exercicio04_easy();
                System.out.println("O dobro de " + numeroDigitado + " é = "
                                + exercicio04_easy.calcularDobro(numeroDigitado));

                // Exercicio05_easy
                String primeiroNumeroDigitado, segundoNumeroDigitado, terceiroNumeroDigitado;
                primeiroNumeroDigitado = JOptionPane.showInputDialog("Digite o primeiro número para calcular!");
                segundoNumeroDigitado = JOptionPane.showInputDialog("Digite o segundo número para calcular!");
                terceiroNumeroDigitado = JOptionPane.showInputDialog("Digite o terceiro número para calcular!");

                int primeiroNumero = Integer.parseInt(primeiroNumeroDigitado);
                int segundoNumero = Integer.parseInt(segundoNumeroDigitado);
                int terceiroNumero = Integer.parseInt(terceiroNumeroDigitado);

                Exercicio05_easy exercicio05_easy = new Exercicio05_easy();
                System.out.println("A soma dos números digitados é: "
                                + exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero));

                System.out.println("A subtração dos números digitados é: "
                                + exercicio05_easy.subtracao(primeiroNumero, segundoNumero, terceiroNumero));

                System.out.println("A multiplicação dos números digitados é: "
                                + exercicio05_easy.multiplicacao(primeiroNumero, segundoNumero, terceiroNumero));

                int soma = exercicio05_easy.soma(primeiroNumero, segundoNumero, terceiroNumero);

                System.out.println("A média dos números digitados é: "
                                + exercicio05_easy.media(soma));

        }

}
