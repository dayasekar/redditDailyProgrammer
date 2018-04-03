package org.daya.rdp.alphabetCipher;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlphabetCipher {

    public String encrypt(String seed, String plainText) {
        return null;
    }

    Map<String, Map<String, String>> getCipherBlock(String seed) {
        char[] alphabets = IntStream.rangeClosed('a', 'z').mapToObj(c -> "" + (char) c).collect(Collectors.joining()).toCharArray();
        Map<String, Map<String, String>> cipherBlock = new HashMap<>();
        for (int i = 0; i < alphabets.length; i++) {

            Map<String, String> map = new HashMap<>();

            for (int j = 0; j < alphabets.length; j++) {
            }

            cipherBlock.put(String.valueOf(alphabets[i]), map);
        }
        return cipherBlock;
    }
}
