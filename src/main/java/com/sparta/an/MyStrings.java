package com.sparta.an;

public class MyStrings {
    public void sayHello() {
        System.out.println("Hello!");
    }

    public Boolean letterExists(String strIn, String strSearch){
        return strSearch.contains(strIn);
    }

    public String reverse(String word){
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--)
            reversedWord+= word.charAt(i);

        return reversedWord;
    }

    public Boolean isPalindrome(String word){
        return reverse(word).equals(word);
    }
}