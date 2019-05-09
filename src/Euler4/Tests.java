package Euler4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {
    @Test
    public void shouldReturnIfANumberIsPalindromeOrNot(){
        boolean isPalindrome = PalindromeDetector.isPalindrome(9009);
        assertTrue(isPalindrome);
        boolean isNotPalindrome = PalindromeDetector.isPalindrome(9001);
        assertFalse(isNotPalindrome);
        assertTrue(PalindromeDetector.isPalindrome(906609));

    }
    @Test
    public  void shouldReturn99WhenMaxNumberIs2(){
        int expectedMax = 99;
        int actual = MaxNumberGetter.getMaxNumber(2);
        assertEquals(expectedMax, actual);
    }
    @Test
    public void shouldReturn9009when2Digits(){
        int expectedNumber = 9009;
        int actual = PalindromeFinder.find(2);
        assertEquals(expectedNumber, actual);
    }
    @Test
    public void shouldReturn906609when3Digits(){
        int expectedNumber = 906609;
        int actual = PalindromeFinder.find(3);
        assertEquals(expectedNumber, actual);
    }
}
