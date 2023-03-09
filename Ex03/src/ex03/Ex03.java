/*
3) Faça um programa, em Java, que criptografe uma frase dada pelo usuário invertendo a frase informada.
Exemplo:
Eu estou na universidade

Saída:
edadisrevinu an uotse uE
 */
package ex03;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Ex03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        
        System.out.println("Digite a frase:");
        frase = input.nextLine();
        
        System.out.println("\nA frase invertida é:");
        System.out.println(inverterFrase(frase));
    }
    public static String inverterFrase (String frase){
        String aux = "";
        for (int i = (frase.length()-1); i >= 0; i--){
            aux = aux + frase.charAt(i);
        }
        return aux;
    }    
}
