package ua.hillel.brizhak.lessons.lesson4;

public class Main {
    public static void main(String[] args) {

//        System.out.println(5+5);
//
//        int a = 10;
//        int b = 3;
//
//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println(a/b);
//
//        System.out.println(10.0/3);
//
//        System.out.println((int)3.3333333333333335);
//
//        System.out.println((double)a/b);
//        System.out.println((double)a/(double)b);
//        System.out.println(a/(double)b);
//
//        System.out.println((double)10 / 3);
//        System.out.println(10D / 3);
//
//
//        int d = 10;
//        int g = 4;
//
//        System.out.println(d % g);
//        System.out.println(10 % 1);
//        System.out.println(10 % 2);
//        System.out.println(10 % 3);
//        System.out.println(10 % 4);
//        System.out.println(10 % 5);
//        System.out.println(10 % 6);
//        System.out.println(10 % 7);
//        System.out.println(10 % 8);
//        System.out.println(10 % 9);
//        System.out.println(10 % 10);
//
//        d = d + 5;
////        d += 5;
////        d -= 5;
////        d *= 5;
////        d /= 5;
////        d %= 5;
//        System.out.println(d);
//
//
//
        int u = 5;
//        int y =10;
//
//        int sum = ++u + u++ - y-- + ++y; // 6(5+1) + 6(7 пошло в вверх) -10(9 пошло вверх) + 10
//
////        u = u + 1;
//        u += 1;
        u++;
//
//        System.out.println("sum = " + sum);
        System.out.println("u = " + u);
//        System.out.println("y = " + y);

//
//        int a = 700;
//        int b = 2000;
//        int c= 3500;
//
//        int month = 10 * 12;
//
//        int salary1 = a * month;
//        int salary2 = b * month;
//        int salary3 = c * month;
//
//
//        double tax = 0.05;
//
//        double salaryWitoutTax1 = salary1 - salary1 * tax;
//        double salaryWitoutTax2 = salary2 - salary2 * tax;
//        double salaryWitoutTax3 = salary3 - salary3 * tax;
//
//        System.out.println(salaryWitoutTax1);
//        System.out.println(salaryWitoutTax2);
//        System.out.println(salaryWitoutTax3);
//
//        double sum = salaryWitoutTax1 + salaryWitoutTax2 + salaryWitoutTax3;
//        double avg = sum / 3;
//
//        System.out.println("sum =" + sum);
//        System.out.println("avg =" + avg);

//        System.out.println(5 - 2 * 4);
//        System.out.println((5 - 2) - (5 - 2) * 4);
//        System.out.println(((5 - 2) - (5 - 2)) * 4);


        System.out.println(Math.E);
        System.out.println(Math.PI);

        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));

        System.out.println(Math.pow(5, 3));

        System.out.println(Math.sqrt(16));
        System.out.println(Math.sqrt(121));
        System.out.println(Math.sqrt(9.22));

        System.out.println(Math.min(10, 20));
        System.out.println(Math.max(10, 20));

        System.out.println(Math.round(10.5));
        System.out.println(Math.round(10.4));
        System.out.println(Math.round(10.7));

        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println((int)Math.random() * 10); // всегда 0
        System.out.println((int) (Math.random() * 10)); // никогда не упадет 10
        System.out.println((int) (Math.random() * 11)); //
        System.out.println(Math.round(Math.random() * 10));


        int min = 15;
        int max = 30;

        int random = (int) ((Math.random() * (max - min + 1)) + min);

        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));
        System.out.println((int) ((Math.random() * (max - min + 1)) + min));

        int a = 5;
        a += ++a;
        a += ++a - --a;






















    }
}
