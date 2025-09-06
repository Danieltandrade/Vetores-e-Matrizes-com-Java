package arraysmatrizes;

/**
 *
 * @author Daniel Torres de Andrade
 */

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    Scanner entrada = new Scanner(System.in);
        
    private int numero;
    private int tam;
    private int[] vetor;

    public int[] CriandoArray(){
        // Criando um Array.
        System.out.println("--- CONSTRUINDO UM ARRAY ---");
        
        // Definindo tamanho do Array.
        System.out.print("Digite o tamanho do ARRAY: ");
        tam = entrada.nextInt();
        vetor = new int[tam];

        // Inserindo elementos em um Array.
        System.out.println("Agora vamos comecar a digitar os elementos do ARRAY.");
        for(int i=0;i<tam;i++){
            if(i < (tam -1)){
                System.out.print("Digite o numero para o elemento '" + i + "' : ");
                numero = entrada.nextInt();
                vetor[i] = numero;
            }else{
                System.out.print("Digite o ultimo elemento: ");
                numero = entrada.nextInt();
                vetor[i] = numero;
            }
        }

        return vetor;
    }
    
    public int[] OrdenadorArray(int[] vetor){
        // Ordenando Array através do método "sort".
        Arrays.sort(vetor);
        return vetor;
    }
    
    public void MostrandoArray(int[] vetor){
        int cont=1;
        for(int n:vetor){
            if(cont == 1){
                System.out.printf("[%d, ", n);
            }else if(cont > 1 && cont < (vetor.length)){
                System.out.printf("%d, ", n);
            }else{
                System.out.printf("%d]", n);
            }
            cont++;
        }
    }
}
