package arraysmatrizes;

/**
 *
 * @author Daniel Torres de Andrade
 */
import java.util.Scanner;

public class Matrizes {
    Scanner entrada = new Scanner(System.in);
    
    private int linhas;
    private int colunas;
    private int numero;
    private int[][] matriz;
    
    public int[][] CriandoMatriz(){
        // Criando uma Matriz.
        System.out.println("--- CONSTRUINDO UMA MATRIZ ---");
        
        // Definindo a quantidade de linhas e coluna de uma Matriz.
        System.out.print("Digite a quantidade de linhas da Matriz: ");
        linhas = entrada.nextInt();
        System.out.print("Digite a quantidade de colunas da Matriz: ");
        colunas = entrada.nextInt();
        matriz = new int[linhas][colunas];
        
        // Inserindo elementos em uma Matriz.
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                System.out.print("Digite um numero inteiro para o elemento i:" + (i+1) + ", j:" + (j+1) + " : ");
                numero = entrada.nextInt();
                matriz[i][j] = numero;
            }
        }
        
        return matriz;
    }
    
    public void MostrandoMatriz(int[][] matriz){
        
        for(int[] i:matriz){
            for(int j:i){
                System.out.printf("%2d | ", j);
            }
            System.out.printf("%n");
        }
    }
}
