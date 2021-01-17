package com.my.excercise.tables;


public class Application {
    public static void main(String[] args) {
        Formulas formulas = new Formulas();

        String test = Integer.toBinaryString(1992837);

        System.out.println(test);
    }
}
class Formulas {


    public void binaryOp(int binaryCode) {
        int binaryCodeTemp = binaryCode;

    }

    public int potegowanie(int podstawaPotegi, int wykladnikPotegi) {
        int result = 1;
        for (int i = 1; i <= wykladnikPotegi; i++) {
            result = result * podstawaPotegi;
        }
        return result;
    }

}
