package com.skymate8.module2.five;

public class Main {
    public static void main(String[] args) {
        System.out.println(new CaesarCipher().encrypt("gdkkn",1));
        System.out.println(new CaesarDecrypter().decrypt("hello",1));
    }
}
