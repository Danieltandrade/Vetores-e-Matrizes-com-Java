package arraysmatrizes;

/**
 *
 * @author Daniel Torres de Andrade
 */

import java.util.Scanner;

public class ArraysMatrizes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Declarando variáveis.
        int[] vetor;
        int[][] matriz;
        char escolha;
        
        // Iniciando impressões no terminal.
        System.out.println("---- Trabalhando com Vetores e Matrizes em JAVA ----");
        // Escolhendo entre manipular Vetores ou Matrizes;
        System.out.print("Para trabalharmos com Vetores digite 'V'ou para Matriz digite 'M': ");
        escolha = entrada.next().charAt(0);
        escolha = Character.toUpperCase(escolha);
        
        // Estrutura de decisão "switch".
        switch(escolha){
            // Escolhendo mnipular Vetores.
            case 'V' -> {
                // Criando o objeto "manipulando_vetor" para usar um ARRAY.
                Vetores manipulando_vetor = new Vetores();
                // Criando um ARRAY ordenado.
                vetor = manipulando_vetor.CriandoArray();
                vetor = manipulando_vetor.OrdenadorArray(vetor);
                // Mostrando ARRAY criado.
                manipulando_vetor.MostrandoArray(vetor);
            }
            // Escolhendo manipular Matrizes.
            case 'M' -> {
                // Criando o objeto "manipulando_matriz" para usar uma MATRIZ.
                Matrizes manipulando_matriz = new Matrizes();
                // Criando uma Matriz.
                matriz = manipulando_matriz.CriandoMatriz();
                // MOstrando a Matriz criada.
                manipulando_matriz.MostrandoMatriz(matriz);
            }
            // Para opçoes inválidas.
            default -> System.out.println("Digite uma opcao valida!");
        }
    }   
}
