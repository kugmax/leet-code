package com.kugmax.learn.letcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPhoneToLetters {

    @Test
    public void test() {
        PhoneToLetters solution = new PhoneToLetters();
        assertThat(solution.letterCombinations("23"))
                .contains("ad")
                .contains("ae")
                .contains("af")
                .contains("bd")
                .contains("be")
                .contains("bf")
                .contains("cd")
                .contains("ce")
                .contains("cf");
    }
}
