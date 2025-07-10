package com.estudo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void getIdadeTest() {
        Pessoa alex = new Pessoa("Alex", LocalDate.of(2000, 7, 20));
        Assertions.assertEquals(24, alex.getIdade());
    }
}