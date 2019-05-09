package Euler4;

public class PalindromeDetector {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        if ((originalNumber - reversedNumber) != 0 ){
            return false;
        }
        return true;
    }
}

class MaxNumberGetter{

    public static int getMaxNumber(int i) {
        return (int) Math.pow(10, i) - 1;
    }
}
