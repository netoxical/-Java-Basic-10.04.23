package ua.hillel.brizhak.homeworks.homework8;

public class Homework8 {
        public static void main(String[] args) {

            int j = 1;
            int n = 100;
            for ( int i = 1 ; j <= n; i++ , j++) {
                int a = i / 10;
                int b = i % 10;
                int c = i / 10 % 10;
                if (i == 4 || i == 9 || a == 4 || a == 9 || b == 9 || b == 4 || c == 9 || c == 4) {
                    j = j - 1;
                    continue;
                } else if (j == n + 1) {
                    break;
                }
                System.out.print(" " + i);
            }

        }
    }
