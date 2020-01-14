/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

public class MissinSeqNumber {

    int inputArray[] = null;
    int limit = 0;
    private Scanner scanner = null;

    public MissinSeqNumber() {
        getInput();
        findingMissedOne();

    }

    private void getInput() {
        scanner = new Scanner(System.in);
        System.out.println(" Enter total number of elements ");
        limit = scanner.nextInt();
        int arraySize = limit - 1;
        System.out.println(" Array  size  :" + arraySize);
        inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
    }

    private void findingMissedOne() {
        int actualValue = (limit * (limit + 1)) / 2;
        int arrayValue = 0;
        for (int i : inputArray) {
            arrayValue = arrayValue + i;
        }
        System.out.println(" Missing value (from the randomly inserted array) : " + (actualValue - arrayValue));

    }

}
