package company;

import java.util.Scanner;

class MainClass {
    int matrix[][];
    int row, column;

    void create() {
        Scanner in = new Scanner(System.in);

        System.out.println("number of rows : ");
        row = Integer.parseInt(in.nextLine());

        System.out.println("number of rows : ");
        column = Integer.parseInt(in.nextLine());

        matrix = new int[row][column];

        System.out.println("Enter Datas : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = in.nextInt();

            }
        }
        in.close();


    }

    void display() {
        System.out.println("\nMatrix is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}

class TwoDimensionalArrays {
    public static void main(String[] args) {

        MainClass obj = new MainClass();
        obj.create();
        obj.display();

    }
}
