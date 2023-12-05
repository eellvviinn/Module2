package com.skymate8.module2.five;

import java.util.List;

public class CaesarDecrypter {
    private List<Character> alpha = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
    public String decrypt(String message, int shift){
        char letters[] = message.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            letters[i] = alpha.get((alpha.indexOf(letters[i]) - shift + 26) % 26);
        }
        return String.valueOf(letters);
    }
}

