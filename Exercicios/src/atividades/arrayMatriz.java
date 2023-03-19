package atividades;

public class arrayMatriz {
    public static void main(String[] args) {

        int[][] numeros = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int linha,coluna,somaSecundaria=0,somaPrincipal=0;
        int[] numerosDiagonalPrincipal = new int[3], numerosDiagonalSecundaria = new int[3];

        for(linha=0;linha<3;linha++) {
            for(coluna=0;coluna<3;coluna++) {

                if(linha == coluna) {
                    somaPrincipal = somaPrincipal + numeros[linha][coluna];
                    numerosDiagonalPrincipal[linha] = numeros[linha][coluna];
                }

                if (coluna==2) {
                    somaSecundaria += (numeros[linha][coluna-linha]);
                    numerosDiagonalSecundaria[linha] = numeros[linha][coluna-linha];
                }
            }
        }

        for(coluna = 0; coluna < 3 ; coluna++){
            if(coluna == 0){
                System.out.print("Elementos da Diagonal Principal: ");
            }
            System.out.print(numerosDiagonalPrincipal[coluna]+ " ");
        }


        for(coluna = 0; coluna < 3 ; coluna++){
            if(coluna == 0){
                System.out.print("\nElementos da Diagonal Secundaria: ");
            }
            System.out.print(numerosDiagonalSecundaria[coluna]+ " ");
        }



        System.out.println("\nSoma dos valores da diagonal Principal: "+somaPrincipal);
        System.out.print("Soma dos valores da diagonal Secundária: "+somaSecundaria);

    }

}
