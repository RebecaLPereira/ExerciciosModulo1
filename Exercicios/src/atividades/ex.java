package atividades;
import java.util.Scanner;

public class ex {
    //Rodando o meu for encadeado
    //Linha 0 X Coluna 0
    //Linha 0 X Coluna 1
    //Linha 0 X Coluna 2
    //Linha 1 X Coluna 0
    //Linha 1 X Coluna 1
    //Linha 1 X Coluna 2
    //Linha 2 X Coluna 0
    //Linha 2 X Coluna 1
    //Linha 2 X Coluna 2

    public static void main(String[] args) {

        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int linha,coluna,somaSecundaria=0,somaPrincipal=0;


        for(linha=0;linha<3;linha++) {
            for(coluna=0;coluna<3;coluna++) {

                 if(linha == coluna) {
                    System.out.println("Elementos da Diagonal Principal:"+numeros[linha][coluna]);
                    somaPrincipal = somaPrincipal + numeros[linha][coluna];
                }
                 if (coluna==2) {

                     System.out.println(numeros[linha][coluna - linha]);
                     somaSecundaria += (numeros [linha][coluna-linha]);

                 }
            }
        }

        System.out.println("Soma dos valores da diagonal principal: "+somaPrincipal);
        System.out.println("Soma dos valores da diagonal secundária: "+somaSecundaria);

    }

}
