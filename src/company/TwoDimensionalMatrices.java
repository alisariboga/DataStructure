package company;

import java.util.Scanner;

public class TwoDimensionalMatrices {
    class MainClass {

        int matrix[][];
        int row, column;

        void create() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please give me number!!");

            System.out.println("Number of rows");
            row = Integer.parseInt(in.nextLine());

            System.out.println("Numbers of rows");
            column = Integer.parseInt(in.nextLine());

            matrix = new int[row][column];
            for (int i = 0; i < row; i++){
                for (int j = 0; j < 0; j++){
                    matrix[i][j] = in.nextInt();
                }
            }
            in.close();
        }

        void display(){
            System.out.println("\nMatrix is  : ");

            for (int i = 0; i < row; i++){
                for (int j = 0; j < 0; j++){

                }
            }
        }


    }


    public static void main(String[] args) {

    }
}
