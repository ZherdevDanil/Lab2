package org.example;

import java.util.Scanner;

/*
 * 1505%5 = 0 => дія з матрицями С=a*b , a - const
 * 1505%7 = 0 => тип елементів матриці double
 * 1505%11= 9 => Знайти середнє значення елементів кожного стовпчика матриця
 * */

public class Lab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість рядків");
        int countOfRow = scanner.nextInt();

        System.out.println("Введіть кількість стовбців");
        int countOfColumn = scanner.nextInt();

        //цикл для вводу елементів матриці розміром countOfRow на countOfColumn
        double[][] matrix_B = new double[countOfRow][countOfColumn];
        for (int i = 0; i < countOfRow; i++) {
            for (int j = 0; j < countOfColumn; j++) {
                System.out.println("Введіть елемент матриці з індексом " + (i + 1) + " " + (j + 1));
                double elem = scanner.nextDouble();
                matrix_B[i][j] = elem;
            }
        }

        //Вивід матриці
        System.out.format("Матриця:\n");
        for (int i = 0; i < countOfRow; i++) {
            for (int j = 0; j < countOfColumn; j++) {
                System.out.print(matrix_B[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        System.out.println("Введіть коефіціент : ");
        int coefficient = scanner.nextInt();

        //Створюємо нову матриці matrix_C, яка буде результатом множення коефіціенту на матрицю B
        /*double avgOfColumnElements = 0;*/
        double[][] matrix_C = new double[countOfRow][countOfColumn];
        for (int i = 0; i < countOfRow; i++) {
            for (int j = 0; j < countOfColumn; j++) {
                matrix_C[i][j] = coefficient * matrix_B[i][j];
            }

        }

        //Вивід матриці С
        System.out.println("Результат множення матриці на коефіціент");
        for (int i = 0; i < countOfRow; i++) {
            for (int j = 0; j < countOfColumn; j++) {
                System.out.print(matrix_C[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


        //знаходження середнього значення елементів кожного стовпця матриці С
        double sumOfColumnElements = 0;
        double[] avg = new double[countOfColumn];
        for (int i = 0; i < countOfRow; i++) {
            sumOfColumnElements = 0;
            for (int j = 0; j < countOfColumn; j++) {
                sumOfColumnElements += matrix_C[j][i];
            }
            avg[i] = sumOfColumnElements / countOfRow;
            System.out.println("Середне значення елементів стовбця " + i + " :" + avg[i]);
        }
    }

}