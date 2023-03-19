package atividades;


import java.util.Scanner;

public class arrayMatriz2 {

    public static void main(String[] args) {
        float[][] notas = new float[10][4];
        float [] mediaAlunos = new float[10];
        float somaNota, media=0;

        Scanner leia = new Scanner(System.in);

        for (int linha = 0; linha < 10; linha++) {
            somaNota = 0;
            for (int coluna = 0; coluna < 4;coluna++) {
                System.out.print("Insira a nota: ");
                notas [linha][coluna] = leia.nextFloat();
                somaNota += notas [linha][coluna];
                if (coluna==3){
                    mediaAlunos[linha] = somaNota/4;
                }
            }
        }
        for (int linha = 0; linha<10;linha++) {
            System.out.printf("A média do " + (linha+1) + "º aluno é: %.1f", mediaAlunos[linha]);
            System.out.println();
        }

    }
}
