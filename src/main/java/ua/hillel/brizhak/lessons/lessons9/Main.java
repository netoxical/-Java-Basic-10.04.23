package ua.hillel.brizhak.lessons.lessons9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[][] array = new int [3][5];
//
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.deepToString(array));
//        System.out.println(array[0]);
//        System.out.println(array[0].length);
//        System.out.println(array.length);
//        System.out.println(array.length);
//        array [0][0] = 77;
//        array [2][4] = 99;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[] arr = {1, 2, 3, 4, 5};
//        int[][] array = {
//                {1, 2, 3, 4, 5},
//                {6, 7, 8, 9, 10},
//                {11, 12, 13, 14, 15}
//        };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int[] row1 = array[1];
//        for (int i = 0; i < row1.length; i++) {
//            System.out.println(row1[i]);
//        }

//        int[][] matrix = new int[5][5];

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i == j){
//                    matrix[i][j] = 1;
//                }
//            }
//        }

//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i][i] = 1;
//        }

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (i + j == matrix.length - 1) {
//                    matrix[i][j] = 1;
//                }
//            }
//        }

//        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
//            matrix[i][j] = 1;
//        }
//        for (int i = 0; i < matrix.length; i++) {
//            matrix[i][matrix[i].length - 1 - i] = 1;
//        }
//
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//                count++;
//            }
//        }
//        double avg = (double) sum / count;
//        System.out.println("avg = " + avg);

//        char[][] chess = new char[8][8];
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[0].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    chess[i][j] = 'B';
//                } else {
//                    chess[i][j] = 'W';
//                }
////                chess[i][j] = ((i + j) % 2 == 0) ? 'B' : 'W';
//            }
//        }

//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        int[][] array = {
//                {1, 2, 3},
//                {2},
//                {65, 4, 3, 2, 1, 4, 6, 7, 45},
//                {},
//                {4, 4, 4, 4}
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }


//        int[][][] array = new int[3][2][4];
//        int[][][] array = {
//                {
//                        {10, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19 ,55},
//                        {1, 7, 38, 11}
//                }
//        };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        System.out.println(Arrays.toString(array[0][1]));


        int[][][][] array1 = {
                {
                        {
                                {10, 28, 18, 28},
                                {45, 90, 45, 0}
                        },
                        {
                                {7, 125, 500, 5},
                                {0, 11, 25, 30}
                        },
                        {
                                {81, 17, 19, 55},
                                {1, 7, 38, 11}
                        }
                },
                {
                        {
                                {10, 28, 18, 28},
                                {45, 90, 45, 0}
                        },
                        {
                                {7, 125, 500, 5},
                                {0, 11, 25, 30}
                        },
                        {
                                {81, 17, 19, 55},
                                {1, 7, 38, 11}
                        }
                }
                };

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                for (int k = 0; k < array1[i][j].length; k++) {
                    for (int l = 0; l < array1[i][j][k].length; l++) {
                        System.out.print(array1[i][j][k][l] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }




































    }
}
