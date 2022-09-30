package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void isPasswordGivenLongerThen8 () {
       //GIVEN
        String input = "PasswordTest";

       //WHEN
        String actual = Main.checkPasswordLength (input);

       //THEN
        String expected = "Passwort ist länger als 8";
        assertEquals(expected, actual);
    }

}