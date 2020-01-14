
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Abdel this project H
 * ow to check whether a word is palindrome
 */
public class PalindromeString {

    Scanner sc = new Scanner(System.in);

    public PalindromeString() {
        System.out.print("Please enter an word to test: ");
        String x = sc.nextLine();
        check(x);
    }
// palindrome check Function 
    public void check(String x) {
        int First = 0;

        int WordLength = x.length();
        int Last = WordLength - 1;

        int flag = 0;
        for (int i = 0; i < WordLength / 2; i++) {
            if (x.charAt(First) != x.charAt(Last)) {
                flag = 1;
                break;

            }
            First++;
            Last--;

        }
        if (flag == 0) {
            System.out.println("its palindrome");
        } else {

            System.out.println("its not palindrome");
        }

    }

}
