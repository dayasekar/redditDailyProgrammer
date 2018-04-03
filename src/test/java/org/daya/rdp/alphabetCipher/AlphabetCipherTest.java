package org.daya.rdp.alphabetCipher;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class AlphabetCipherTest {

    AlphabetCipher testObject = new AlphabetCipher();

    @Test
    public void encrypt_whenTypical() {
        String seed = "snitch";
        String plainText = "thepackagehasbeendelivered";
        String encryptedText = "lumicjcnoxjhkomxpkwyqogywq";

        String toVerify = testObject.encrypt(seed, plainText);

        assertThat(toVerify, equalTo(encryptedText));
    }
}