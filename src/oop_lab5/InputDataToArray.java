package oop_lab5;
//1.Input Data from user
//2.find summation value of data in array
//3.find average value of data in array
//4.find maximun value of data in arrat

import java.util.Scanner;

public class InputDataToArray {
    private static final int Max = 10;

    public static void main(String[] args){
        int num[] = new  int[Max];
        num = inputData(num);
        showData(num);

    }//main

    private static int[] showData(int[] num) {
        System.out.println(" to array");
        for (int val : num)
            System.out.print(val + " ");
    }


    private static int[]inputData(int []num){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pless enter data to array: ");
        for (int i = 0;i<num.length;i++) {
            System.out.print("num[" + i + "]:");
            num[i] = scanner.nextInt();

        }
        return num;
    }


}//class
