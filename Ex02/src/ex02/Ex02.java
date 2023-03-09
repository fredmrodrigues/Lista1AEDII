/*
2) Faça um programa, em Java, que preencha uma matriz de ordem 3 x 4 (3 linhas e 4 colunas) com números inteiros e positivos; calcule e mostre:
a) o maior elemento da matriz e sua posição (linha e coluna);
b) o menor elemento da matriz e sua posição (linha e coluna).
Exemplo:
  0   1   2   3
0 21  89  3   119

1 5   34  82  13

2 207 83  150 18

Saída:
O maior elemento da matriz informada é 207
Sua posição é: [2, 0]
O menor elemento da matriz informada é 3
Sua posição é: [0, 2]
 */
package ex02;
import java.util.Random;
/**
 * @author fredericorodrigues
 */
public class Ex02 {

    public static void main(String[] args) {
        
        Random aleatorio = new Random();
        int matriz[][] = new int [3][4], posicaoMaior[] = new int [2], posicaoMenor[] = new int[2];
        int maior = 0, menor = 99;
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = aleatorio.nextInt(100);
                System.out.print("[" + matriz[i][j] + "] ");
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                    posicaoMaior[0] = i;
                    posicaoMaior[1] = j;
                } else if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    posicaoMenor[0] = i;
                    posicaoMenor[1] = j;
                }
            }
            System.out.println("\n");
        }
        System.out.println("O MAIOR elemento da matriz é: " + maior);
        System.out.println("Sua posição é: [" + posicaoMaior[0] + ", " + posicaoMaior[1] + "]\n");
        System.out.println("O MENOR elemento da matriz é: " + menor);
        System.out.println("Sua posição é: [" + posicaoMenor[0] + ", " + posicaoMenor[1] + "]\n");
    }
    
}
