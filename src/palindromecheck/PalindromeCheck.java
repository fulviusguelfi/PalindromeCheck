/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromecheck;

/**
 *
 * @author fulvi
 */
public class PalindromeCheck {

    private String word;
    private boolean caseSensitive = false;
    private boolean considerWhiteSpaces = true;
    private boolean isPalindrome = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Checking if ");
            System.out.print(args[0]);
            System.out.println(" is a palindrome");
            boolean isPalindrome = false;
            switch (args.length) {
                case 1:
                    isPalindrome = new PalindromeCheck(args[0]).check();
                    break;
                case 2:
                    System.out.print("Case Sensitive is set to ");
                    System.out.print(args[1]);
                    System.out.println(" it must be true or false");
                    isPalindrome = new PalindromeCheck(args[0]).isCaseSensitive(args[1]).check();
                    break;
                case 3:
                    System.out.print("Case Sensitive is set to ");
                    System.out.print(args[1]);
                    System.out.println(" it must be true or false");
                    System.out.print("Consider White Spaces is set to ");
                    System.out.print(args[2]);
                    System.out.println(" it must be true or false");
                    isPalindrome = new PalindromeCheck(args[0]).isCaseSensitive(args[1]).isConsiderWhiteSpaces(args[2]).check();
                    break;
            }
            System.out.print(args[0]);
            System.out.print(" is ");
            System.out.print((isPalindrome) ? "" : "not ");
            System.out.println("a palindrome");
        }

    }

    public PalindromeCheck(String word) {
        this.word = word;
    }

    public PalindromeCheck isCaseSensitive(String parm) {
        this.caseSensitive = Boolean.parseBoolean(parm);
        return this;
    }

    public PalindromeCheck isConsiderWhiteSpaces(String parm) {
        this.considerWhiteSpaces = Boolean.parseBoolean(parm);
        return this;
    }

    public boolean check() {
        if (!this.considerWhiteSpaces) {
            this.word = this.word.replaceAll(" ", "");
        }
        //create palindrome
        String palindrome = new StringBuilder(this.word).reverse().toString();
        if (!this.caseSensitive) {
            this.isPalindrome = this.word.equalsIgnoreCase(palindrome);
        } else {
            this.isPalindrome = this.word.equals(palindrome);
        }
        return this.isPalindrome;
    }

}
