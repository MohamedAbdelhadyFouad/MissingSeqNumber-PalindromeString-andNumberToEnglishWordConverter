package javaapplication26;

import java.util.Scanner;

public class NumbersToEglishWordConvertor {

    Scanner sc = new Scanner(System.in);
    private String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
    private String twenties[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    private String[] tens = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private String[] hundreds = {"ones", "tens", "hundred", "thousand", "lakhs", "lakhs", "crore", "crore"};
    private String word = "";
    private String tempWord = null;
    private int LastDigit = 0;

    public NumbersToEglishWordConvertor() {

        int value = 0;
        System.out.println("Please Enter a number :");
        value = sc.nextInt();
        int output = Converter(value, 0);

    }

    public int Converter(int num, int i) {
        int divition = num / 10;
        int remind = num % 10;
        ConcatenateWords(remind, i);
        if (divition <= 0) {
            word += tempWord;
            System.out.println("output : " + word);
            return 0;
        } else {

            return Converter(divition, i + 1);
        }
    }

    //Concatenate Words functoion 
    public void ConcatenateWords(int num, int i) {
        String NewWord = null;
        switch (i) {
            case 0:
                NewWord = "" + ones[num];
                break;
            case 1:
                if (num == 1) {
                    word = word;
                    int number = Integer.parseInt(String.valueOf(num + "" + LastDigit));
                    NewWord = " " + twenties[number];
                } else {
                    word = tempWord + word;
                    NewWord = " " + tens[num];
                }
                break;
            case 2:
                word = tempWord + word;
                NewWord = " " + ones[num] + " " + hundreds[i] + " and";
                break;
            case 3:
                word = tempWord + word;
                NewWord = " " + ones[num] + " " + hundreds[i];
                break;

            case 4:
                if (num == 1) {
                    word = word;
                    int number = Integer.parseInt(String.valueOf(num + "" + LastDigit));

                    NewWord = " " + twenties[number] + " " + hundreds[i] + "";
                } else {
                    word = tempWord + word;
                    NewWord = " " + tens[num] + "";
                }
                break;

            default:
                System.out.println("This is default statment, it won't print");
                break;

        }
        LastDigit = num;
        tempWord = NewWord;

    }

}
