package Euler4;

public class PalindromeFinder {
    public static int find(int numberLength) {
        int maxNumber = MaxNumberGetter.getMaxNumber(numberLength);
        int maxPalindrome = 0;
        for (int i=maxNumber; i>0; i--) {
            for (int j = i; j>0; j--) {
                int currentNumber = i * j;
                if (PalindromeDetector.isPalindrome(currentNumber) && currentNumber > maxPalindrome) {
                    System.out.println(i + " y "+  j);
                    maxPalindrome = currentNumber;
                }
            }
        }
        return maxPalindrome;
    }
}
