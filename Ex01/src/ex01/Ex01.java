/*
1) Faça um programa, em Java, para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova.
Os outros dados são os números dos alunos e suas respectivas respostas às questões da prova. Existem dez alunos matriculados. Calcule e mostre:
a) o número e a nota de cada aluno;
b) a porcentagem de aprovação, sabendo-se que a nota mínima necessária para aprovação é cinco.
*/
package ex01;
import java.util.Scanner;
/**
 * @author fredericorodrigues
 */
public class Ex01 {
    
    public static void main(String[] args) {
        
        String gabarito[] = new String[8];
        gabarito[0]="b"; gabarito[1]="a"; gabarito[2]="d"; gabarito[3]="b"; gabarito[4]="c"; gabarito[5]="a"; gabarito[6]="b"; gabarito[7]="b";
        
        String respostas[][] = new String[10][8];
        Scanner input = new Scanner (System.in);
        String resp, situacao;
        int nota[][] = new int[10][8], total[] = new int[10];
        int cont = 0;
        boolean validaResp = false;
        
        System.out.println("INSTRUÇÕES:");
        System.out.println("Abaixo, será apresentado o gabarito das provas;");
        System.out.println("Em seguida, a sequência dos alunos com matrícula crescente, e para cada aluno, espaço para preencher a resposta do aluno para cada questão;");
        System.out.println("As respostas para cada questão são alternativas de 'a' até 'd'. Se o aluno não respondeu à questão, marque '0' como resposta;");
        System.out.println("Ao final da correção de todos os alunos, será apresentado o total de pontos de cada aluno e o percentual de aprovação da turma.\n");
        
        System.out.println("Gabarito:");
        System.out.println("[Q01: " + gabarito[0] + "]  " + "[Q02: " + gabarito[1] + "]  " + "[Q03: " + gabarito[2] + "]  " + "[Q04: " + gabarito[3] + "]  " + "[Q05: " + gabarito[4] + "]  " + "[Q06: " + gabarito[5] + "]  " + "[Q07: " + gabarito[6] + "]  " + "[Q08: " + gabarito[7] + "]  \n");
        
        for (int i = 0; i < 10; i++){
            System.out.print("Digite as respostas do aluno ");
            if (i < 9){
                System.out.print("0");
                System.out.print((i + 1) + ":\n");
            } else
                System.out.print((i + 1) + ":\n");
            for (int j = 0; j < 8; j++){
                while (!validaResp) {
                    System.out.print("Q" + (j + 1) + ": ");
                    resp = input.next();
                    if (resp.equalsIgnoreCase("a") || resp.equalsIgnoreCase("b") || resp.equalsIgnoreCase("c") || resp.equalsIgnoreCase("d") || resp.equalsIgnoreCase("0")){
                        respostas[i][j] = resp;
                        validaResp = true;
                        if (respostas[i][j].equalsIgnoreCase(gabarito[j])){
                            nota[i][j] = 1;
                        } else
                            nota[i][j] = 0;
                    } else
                        System.out.println("Resposta inválida. Digite uma alternativa de 'a' a 'd' ou '0' para zerar a questão.");
                }
                validaResp = false;
            }
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 8; j++){
                total[i] = total[i] + nota[i][j];
            }
            if (total[i] >= 5){
                situacao = "Aprovado!";
                cont = cont + 1;
            } else{
                situacao = "Reprovado!";
            }
            System.out.print("Aluno ");
            if (i < 9){
                System.out.print("0");
                System.out.print((i + 1) + ":____");
            } else
                System.out.print((i + 1) + ":____");
            System.out.print("Nota: " + total[i] + "____ Situação: " + situacao + "\n");
        }
        System.out.println("Porcentagem de aprovação da turma: " + (cont * 10) + "%.\n");
        input.close();
    }
    
}
