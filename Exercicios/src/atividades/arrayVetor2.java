package atividades;

import java.util.Scanner;

public class arrayVetor2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] numero = new int[10];
        int[] impar = new int[5], par = new int[5];
        int soma = 0;
        float media = 0;
        int contadorImpar = 0,contadorPar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numero[i] = leia.nextInt();
            if (i%2!=0) {
                impar[contadorImpar] = numero[i];
                contadorImpar++;
            }else{
                par[contadorPar] = numero[i];
                contadorPar++;
            }
            soma += numero[i];
        }
        media = soma / 10;
    for (int i = 0; i < 5; i++){
        
    }
    }
}
