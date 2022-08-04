package com.sparta.an;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyClassTest {
    MyStrings stringy = new MyStrings();
    @Test
    @DisplayName("Is palindremic")
    void IsPalindremic(){
        Assertions.assertTrue(stringy.isPalindrome("mom"));
    }

    @Test
    @DisplayName("Is not palindremic")
    void IsNotPalindremic(){
        Assertions.assertFalse(stringy.isPalindrome("Rom"));
    }

    @Test
    @DisplayName("Is palindremic with different sizes")
    void IsPalindremicDiffSize(){
        Assertions.assertEquals(false, stringy.isPalindrome("Mom"));
    }

    @Test
    @DisplayName("Is not palindremic with different sizes")
    void IsNotPalindremicDiffSize(){
        Assertions.assertEquals(false, stringy.isPalindrome("SpArKiNg"));
    }
}
