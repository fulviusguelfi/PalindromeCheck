package palindromecheck;

/**
 * PalindromeCheck was specifically maded for a job test
 * 
 * @author Fulvius
 */
public class PalindromeCheck {

    private String word;
    private boolean caseSensitive = false;
    private boolean considerWhiteSpaces = true;
    private boolean isPalindrome = false;

    /**
     * word is a sentence to check this is required.
     * caseSensitive is true to turn on case sensitive check (default:
     * false).
     * considerWhiteSpaces is false to turn off case sensitive check (default:
     * true).
     * Usage:
     * Comnadline: java PalindromeCheck word [ caseSensitive [
     * considerWhiteSpaces ]].
     * (output goes to console)
     * Object:
     * boolean check = new PalindromeCheck(word)
     *      [.isCaseSensitive(caseSensitive)]
     *      [.isConsiderWhiteSpaces(considerWhiteSpaces)]
     *      .check(); 
     *
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

    /**
     * Crontructor for class PalindromeCheck
     * 
     *
     * @param word string the word to be checked
     */
    public PalindromeCheck(String word) {
        this.word = word;
    }

    /**
     * Sets caseSensitive with a parsed boolean value of providedd parameter
     *
     * @param parm string must be true or false
     * @return PalindromeCheck
     */
    public PalindromeCheck isCaseSensitive(String parm) {
        this.caseSensitive = Boolean.parseBoolean(parm);
        return this;
    }

    /**
     * Sets considerWhiteSpaces with a parsed boolean value of provided
     * parameter
     * 
     *
     * @param parm string must be true or false
     * @return PalindromeCheck
     */
    public PalindromeCheck isConsiderWhiteSpaces(String parm) {
        this.considerWhiteSpaces = Boolean.parseBoolean(parm);
        return this;
    }

    /**
     * Sets and Returns isPalindrome to true only if the word provided in
     * constructor is a palindrome
     * 
     *
     * @return boolean
     */
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
