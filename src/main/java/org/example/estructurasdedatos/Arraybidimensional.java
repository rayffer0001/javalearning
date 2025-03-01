package org.example.estructurasdedatos;

public class Arraybidimensional {
    public static void main(String[] args) {

        int[][] matriz = { // bidimensional
                {1, 2, 3}, // [0][0], [0][1], [0][2] i es el aumento en la columna
                {4, 5, 6}, // [1][0], [1][1], [1][2]
                {7, 8, 9}  // [2][0], [2][1], [2][2]
        };

        // matriz[0] -> [1,2,3]
        // matriz[1] -> [4,5,6]
        // matriz[2] -> [7,8,9]
        System.out.println(matriz[1]);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }

}
