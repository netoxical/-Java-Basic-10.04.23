package ua.hillel.brizhak.homeworks.Homework11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int[] matrixSize = new int[2];
        for (int i = 0; i < matrixSize.length; i++) {
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                matrixSize[i] = userValue;
                if (userValue < 0) {
                    i = i - 1;
                    System.out.println("Enter a number above 0");
                }
            } else {
                i = i - 1;
                System.out.println("wrong data! try again");
            }
            scanner.nextLine();
        }
        int M = matrixSize[0];
        int N = matrixSize[1];
        int randomMax = 101;
        int[][] matrix = new int[M][N];
        int[][] newMatrix = new int[N][M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = (int) (Math.random() * randomMax);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                newMatrix[i][j] = matrix[j][i];
                System.out.print(newMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
