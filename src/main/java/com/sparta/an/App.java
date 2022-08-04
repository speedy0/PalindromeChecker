package com.sparta.an;

public class App 
{
    public static void main( String[] args )
    {
        MyStrings stringy = new MyStrings();
        //stringy.sayHello();
        //System.out.println(stringy.letterExists("H", "Hello"));

        String str = "Abrakadabra";
/*
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

        System.out.println("----------");

        for (int i = str.length() - 1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }*/

        System.out.println(stringy.reverse("Hallellujah"));
        System.out.println(stringy.isPalindrome("mom"));
    }
}
