package com.skymate8.module2.five;

import java.util.List;

public class CaesarCipher {
    private List<Character> alpha = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

    public String encrypt(String message, int shift){
        char letters[] = message.toCharArray();
        for(char c: letters){
            c = alpha.get((alpha.indexOf(c) + shift) % 26);
        }
        return String.valueOf(letters);
    }
}
