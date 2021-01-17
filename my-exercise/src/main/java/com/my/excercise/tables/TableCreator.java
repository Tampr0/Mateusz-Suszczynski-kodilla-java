package com.my.excercise.tables;

public class TableCreator {
    int[] tableMain = new int[10];
    int[][] tableMainTwoDimensional = new int[10][10];

    public TableCreator() {
        for (int i = 0; i < 10; i++) {
            tableMain[i] = i + 1;
            for (int j = 0; j < 10; j++) {
                tableMainTwoDimensional[i][j]= i + 1;
                tableMainTwoDimensional[i][j] = j + 1;
            }
        }
    }
    public void showTableMain() {
        for (int i = 0; i < tableMain.length; i++) {
            System.out.println(tableMain[i]);
        }
    }

    public void showTableMainTwoDimensional() {
        for (int i = 0; i < tableMainTwoDimensional.length; i++) {
            for (int j = 0; j < tableMainTwoDimensional[i].length; j++) {
                System.out.print(tableMainTwoDimensional[i][j]);
            }
            System.out.println();

        }
    }
    public void createBoard() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print("  _");
            }
            System.out.println();
            for (int i = 0; i < 10; i++) {
                System.out.print("| _");
            }
            System.out.println("|");
        }

    }
}
