package ua.hillel.brizhak.homeworks.homework18;

public class Main {
    //    public static void main(String[] args) {
//        int[][] matrix = new int[2][2];
//        int randomMax = 10;
//        double average = 0;
//        int size = matrix.length;
//        boolean square = true;
//        for (int[] array : matrix) {
//            if (array.length != size) {
//                square = false;
//                break;
//            }
//        }
//        System.out.println("Is the matrix square: " + square);
//        if (square == true) {
//            for (int i = 0; i < matrix.length; i++) {
//                for (int j = 0; j < matrix[i].length; j++) {
//                    matrix[i][j] = (int) (Math.random() * randomMax);
//                    average = average + matrix[i][j];
//                    System.out.print(matrix[i][j] + "\t");
//                }
//                System.out.println();
//            }
//            average = average / Math.pow(matrix.length, 2);
//            System.out.println(average);
//        }
//    }
    public static int averageArithmetic(int [][] matrix) {
//        int[][] matrix = new int[M][N];
        int randomMax = 10;
        double average = 0;
        int size = matrix.length;
        boolean square = true;
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("error");
            return -2;
        }
        if (matrix.length > 0) {
            for (int[] array : matrix) {
                if (array.length != size) {
                    square = false;
                    System.out.println("Is the matrix square: " + square);
                    return -1;
                }
            }
        }
        System.out.println("Is the matrix square: " + square);
        if (square == true) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * randomMax);
                    average = average + matrix[i][j];
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
            average = average / Math.pow(matrix.length, 2);
            System.out.println(average);
            return 1;
        }
        return 0;
    }
}



